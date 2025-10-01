# Remote Task Manager API 🚀

A simple Micronaut-based backend for managing tasks in a remote team — aligned with SafetyWing's stack.

## 🔧 Tech Stack
- Java 17 + Micronaut
- MySQL (via Hibernate + Liquibase)
- Docker + Docker Compose

## 📦 How to Run

```bash
./gradlew build
docker-compose up
```

API will be available at: `http://localhost:8080/tasks`

## 📜 Example Endpoints

Create a task:
```bash
curl -X POST http://localhost:8080/tasks      -H "Content-Type: application/json"      -d '{"title":"First Task","description":"Try Micronaut","status":"OPEN"}'
```

List tasks:
```bash
curl http://localhost:8080/tasks
```

Update a task:
```bash
curl -X PUT http://localhost:8080/tasks/1      -H "Content-Type: application/json"      -d '{"title":"Updated Task","description":"Micronaut FTW","status":"DONE"}'
```

Delete a task:
```bash
curl -X DELETE http://localhost:8080/tasks/1
```

## 🐳 Deployment
- Runs locally with Docker Compose
- Can be deployed to **Google Cloud Run** or **GKE** with minor tweaks
