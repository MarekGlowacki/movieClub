FROM maven:3.9.1-eclipse-temurin-20 AS MAVEN_BUILD
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn clean
RUN mvn package

FROM openjdk:20-jdk-slim-buster
EXPOSE 8080
COPY --from=MAVEN_BUILD /target/movieclub-*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
