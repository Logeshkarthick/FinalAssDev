FROM openjdk:17
WORKDIR /app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "hibernate-0.0.1-SNAPSHOT.war"]
