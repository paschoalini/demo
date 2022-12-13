FROM eclipse-temurin:11-alpine
ADD target/*.jar /opt/app.jar
CMD ["java", "-jar", "/opt/app.jar"]