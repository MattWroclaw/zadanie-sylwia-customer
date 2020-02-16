FROM openjdk:8-alpine
ADD target/zadanie-sylwia-customer-0.0.1-SNAPSHOT.jar .
EXPOSE 8300
CMD java -jar zadanie-sylwia-customer-0.0.1-SNAPSHOT.jar