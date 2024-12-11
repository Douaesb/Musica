FROM jelastic/maven:3.9.5-openjdk-21 AS builder
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/Musica-0.0.1-SNAPSHOT.jar Musica.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Musica.jar"]
