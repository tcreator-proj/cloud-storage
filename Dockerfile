FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD "build/libs/cloudStorage-0.0.1-SNAPSHOT.jar" cloud_storage.jar
ENTRYPOINT ["java", "-jar", "cloud_storage.jar"]
RUN echo 'собрался'