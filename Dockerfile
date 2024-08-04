FROM openjdk:17-alpine
EXPOSE 8090
ADD target/SpringDockerNodB-0.0.1-SNAPSHOT.war SpringDockerNodB-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/SpringDockerNodB-0.0.1-SNAPSHOT.war" ]