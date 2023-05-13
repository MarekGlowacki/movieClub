docker build . -t movieclub
docker stop movieclub
docker rm movieclub
docker run -d -p 8080:8080 --name=movieclub movieclub