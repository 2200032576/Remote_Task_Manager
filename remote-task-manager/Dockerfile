FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/remote-task-manager-0.1-all.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]