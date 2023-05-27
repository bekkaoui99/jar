FROM maven:3.9.2-eclipse-temurin-17-alpine
COPY pom.xml .
COPY src src
RUN mvn clean
RUN mvn package  -DskipTests=true -Dmaven.test.skip=true
COPY target/application.jar target/app.jar
CMD ["java" , "-jar" , "target/app.jar"]