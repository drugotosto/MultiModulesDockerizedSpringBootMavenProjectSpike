FROM openjdk:8-jdk-alpine
MAINTAINER Maurizio Ferrero <ferrero.maurizio@gmail.com>

#RUN apk update && apk upgrade
RUN mkdir -p /usr/local/demo
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/local/demo/web-spike.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/local/demo/web-spike.jar"]