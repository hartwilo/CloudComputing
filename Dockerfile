FROM openjdk:11-jre-slim
COPY target/CloudComputing-0.0.1-SNAPSHOT.jar /opt/app.jar
CMD ["java", "-jar", "/opt/app.jar"]