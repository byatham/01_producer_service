# Use the official OpenJDK base image
FROM openjdk:17-jdk-slim


# Copy the jar file into the container
ADD target/producer-service.jar producer-service.jar

# Expose the port on which the application will run
EXPOSE 9001

# Command to run the application
ENTRYPOINT ["java", "-jar", "producer-service.jar"]
