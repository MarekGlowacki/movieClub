docker build . -t movieclub
docker stop movieclub || true
docker rm movieclub || true
docker run -d -p 8080:8080 --name=movieclub -e SPRING_PROFILES_ACTIVE=dev --network movieclub-network movieclub