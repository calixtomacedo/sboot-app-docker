FROM openjdk:21-jdk-oracle

# Create a folder
VOLUME /apps

# Copy all files that end with letter .jar to folder above
COPY target/*.jar /apps/app-docker.jar

# Run the command to start the application java
ENTRYPOINT ["java", "-jar", "/apps/app-docker.jar"]

# Bulding the image:
# Parameters: "-t":tag, ".": current location
# docker build -t sboot-app-docker .

# See images on container
# docker images

# Run the image
# docker run -p 8080:8080 image-id or image-name

# See containers
# docker ps -a

# Delete images
# docker image rm name or id the image