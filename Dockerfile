FROM eclipse-temurin:17-jdk-jammy
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} prueba-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/prueba-0.0.1-SNAPSHOT.jar"]
