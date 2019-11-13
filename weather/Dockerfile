FROM openjdk:11.0.5-jre-slim-buster
COPY target/weather-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -Djava.net.preferIPv4Stack=true -jar ./weather-0.0.1-SNAPSHOT.jar
