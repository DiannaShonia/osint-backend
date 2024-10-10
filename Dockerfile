FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy all files from the distributions directory
COPY build/libs/* ./

# Specify the command to run the application
#ENTRYPOINT sleep 3600
#CMD ["java", "-cp", "backend.jar:lib/*", "MainKt"]
CMD ["java", "-jar", "backend-all.jar"]