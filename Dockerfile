# Stage 1: Build the app using Maven
FROM maven:3.8.7-openjdk-18 AS builder
WORKDIR /app
COPY . .
RUN mvn clean install
# Stage 2: Use a lightweight JRE image to run the app
FROM eclipse-temurin:18-jre
WORKDIR /app
COPY --from=builder /app/target/docker-java-app-example.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "docker-java-app-example.jar"]
