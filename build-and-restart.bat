docker build . -t movieclub

docker run -d -p 8080:8080 --name=movieclub -e SPRING_PROFILES_ACTIVE=prod --network movieclub-network --restart unless-stopped movieclub