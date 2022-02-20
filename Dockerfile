FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} atmdata-1.0.0.jar
ENTRYPOINT ["java","-jar","/atmdata-1.0.0.jar"]