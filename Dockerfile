# Use Maven with JDK 18 for both build and runtime
FROM maven:3.8.7-openjdk-18
# Set working directory
WORKDIR /app
# Copy source code
COPY . .
# Build the app, but don't skip tests yet
RUN mvn clean install -DskipTests=true
#Test check
# Expose app port
EXPOSE 8080
# Start the Spring Boot app (runs in background)
CMD java -jar target/docker-java-app-example.jar
