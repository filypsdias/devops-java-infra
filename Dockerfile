FROM openjdk:17-oracle
MAINTAINER Filipe Lima "filipedias1708@gmail.com"

EXPOSE 8080
ARG JAR_FILE=target/dummy-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

# run with docker build -t devops-java .
# run with docker run -d -it -p:8080:8080 --name=kz devops-java