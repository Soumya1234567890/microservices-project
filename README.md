Microservices Project

🚀 Project Overview
This project is a complete implementation of a Microservices-based architecture using Spring Boot.
Each service is independently deployable, scalable, and communicates synchronously (REST API) .

📚 Tech Stack
Java 8+

Spring Boot (latest)

Spring Cloud Config (for centralized config)

REST APIs (for service communication)

MySQL / PostgreSQL (for persistence)

Eureka (for service discovery — optional)

Gateway API (API Gateway Pattern)

🏗️ Microservices Included

Service Name	Description

Quiz Service	: Handles quiz creation and management
Question Service	: CRUD operations for questions
API Gateway	: Single entry point for all services
Config Server	Manages all microservice configurations centrally

🛠️ How to Run Locally
Clone the repository:
 - git clone https://github.com/Soumya1234567890/microservices-project.git
Navigate into each microservice folder and run:
 - mvn spring-boot:run
or
 - ./mvnw spring-boot:run
 - 
Run Config Server and Eureka Server first (if you are using them).

Use Postman / Swagger to test APIs.

🖼️ Project Architecture
Client → API Gateway → Microservices (Quiz, Question, etc.) → Database
                    ↘️ Config Server
                    ↘️ Eureka Server
✨ Features
Independent deployment of services
Centralized configuration
Load balancing and service discovery

📦 Future Enhancements
Add Kubernetes deployment (Helm charts)
Add Docker-ready setup 
Implement distributed tracing (Zipkin, Sleuth)
Integrate CI/CD pipeline (GitHub Actions, Jenkins)

🙌 Contributing
Contributions are welcome! Feel free to fork the repo and raise a pull request.
