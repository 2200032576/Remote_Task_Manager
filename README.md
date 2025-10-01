//// $$ 
Remote Task Manager 

A lightweight backend service built with Micronaut + Java for managing remote team tasks.
This project demonstrates modern backend practices aligned with SafetyWing’s stack: Java, Micronaut, MySQL, Hibernate, Liquibase, Docker, Kubernetes-ready.

//// 
Tech Stack

Java 17 + Micronaut
 (lightweight JVM framework)

MySQL 8 (persistent storage)

Hibernate JPA (ORM)

Liquibase (schema versioning)

Docker + Docker Compose (containerization)

Cloud-ready (Google Cloud Run / GKE)

 Project Structure:''
 
remote-task-manager/
 ├── build.gradle
 ├── settings.gradle
 ├── Dockerfile
 ├── docker-compose.yml
 ├── README.md
 └── src/
     └── main/
         ├── java/com/example/taskmanager/
         │     ├── controller/TaskController.java
         │     ├── model/Task.java
         │     ├── repository/TaskRepository.java
         │     └── service/TaskService.java
         └── resources/
               ├── application.yml
               └── db/changelog/db.changelog-master.xml

 Features

Create Task → POST /tasks

List Tasks → GET /tasks

Update Task → PUT /tasks/{id}

Delete Task → DELETE /tasks/{id}

 Getting Started
1. Clone the repo
git clone https://github.com/YOUR_USERNAME/Remote_Task_Manager.git
cd Remote_Task_Manager

2. Build the project
./gradlew build

3. Start with Docker Compose
docker-compose up


Services:

API: http://localhost:8080/tasks

MySQL: localhost:3306 (user: user, password: password, db: taskdb)

 Example API Calls
Create a Task
curl -X POST http://localhost:8080/tasks \
     -H "Content-Type: application/json" \
     -d '{"title":"First Task","description":"Try Micronaut","status":"OPEN"}'

List Tasks
curl http://localhost:8080/tasks

Update a Task
curl -X PUT http://localhost:8080/tasks/1 \
     -H "Content-Type: application/json" \
     -d '{"title":"Updated Task","description":"Micronaut FTW","status":"DONE"}'

Delete a Task
curl -X DELETE http://localhost:8080/tasks/1

 Deployment

Runs locally with Docker Compose

Deployable on Google Cloud Run or GKE with minor tweaks

Kubernetes manifests can be added under /k8s for cloud deployment

 Why This Project?_____________________________________________________________________________________________________

This project is intentionally small but demonstrates real-world backend skills:

REST API with Micronaut

Database migrations with Liquibase

Containerization with Docker

Cloud-native ready for GCP/Kubernetes
