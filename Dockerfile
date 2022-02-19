FROM openjdk:11
#this adds the packaged jar file into the container and keep it in root directory
ADD anderson_docker.jar anderson_docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "anderson_docker.jar"]