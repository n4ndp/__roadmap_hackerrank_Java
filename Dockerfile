FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
CMD ["bash"]
# docker build -t java_container .
# docker run -it --rm java_container
