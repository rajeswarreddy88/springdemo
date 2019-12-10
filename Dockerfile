FROM openjdk:latest
ADD target/Docker-Demo-0.0.1-SNAPSHOT.jar docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]
EXPOSE 8085