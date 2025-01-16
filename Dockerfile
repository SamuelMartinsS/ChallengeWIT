FROM openjdk:17-jdk-slim
COPY build/libs/calculatorAppChallenge-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
