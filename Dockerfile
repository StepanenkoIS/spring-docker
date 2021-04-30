FROM maven:3.6-jdk-11
ADD . /cxfbootsimple
WORKDIR /cxfbootsimple
RUN mvn clean
RUN mvn package
FROM adoptopenjdk/openjdk11:alpine-jre
COPY --from=0 /cxfbootsimple/target/spring-docker-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
