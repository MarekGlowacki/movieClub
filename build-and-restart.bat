docker build . -t movieclub

docker run -d -p 8080:8080 --name=movieclub movieclub -e SPRING_PROFILES_ACTIVE=prod --network NETWORK movieclub --restart unless-stopped movieclub