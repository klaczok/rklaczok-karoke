FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE
VOLUME /tmp
COPY ${JAR_FILE} karaoke.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/karaoke.jar"]