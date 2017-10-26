FROM zhai/java8-resin4:latest
VOLUME /tmp
ADD service-hi-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
RUN echo $(date) > /image_built_at
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
#EXPOSE 8761