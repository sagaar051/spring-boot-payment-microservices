# SpringMicroPay: Modular Payments API with Spring Boot Microservices

SpringMicroPay is a modular payment system designed with a microservices architecture using Spring Boot 3, Java 17, and PostgreSQL. It includes API Gateway routing, JWT-based authentication, and secure transaction handling. This project is containerized with Docker and can be deployed via `docker-compose`.

---

## 🚀 Features

- Authentication microservice with JWT-based login and token validation
- Transaction microservice for secure payment processing
- API Gateway routing to backend services
- Centralized configuration and secure service-to-service communication
- PostgreSQL database for persistence
- Dockerized microservices for isolated development
- CI/CD ready (extensible with GitHub Actions or Jenkins)

---

## 📁 Project Structure

```
SpringMicroPay
├── payments-api-gateway
│   ├── src/main/java/com/micropay/gateway/
│   │   └── GatewayApplication.java
│   └── src/main/resources/
│       └── application.yml
│
├── payments-auth-service
│   ├── src/main/java/com/micropay/auth/
│   │   ├── AuthApplication.java
│   │   ├── controller/
│   │   │   └── AuthController.java
│   │   ├── service/
│   │   │   └── AuthService.java
│   │   ├── model/
│   │   │   └── User.java
│   │   ├── repository/
│   │   │   └── UserRepository.java
│   │   └── config/
│   │       ├── SecurityConfig.java
│   │       └── JwtUtil.java
│   └── src/main/resources/
│       └── application.yml
│
├── payments-transaction-service
│   ├── src/main/java/com/micropay/transaction/
│   │   ├── TransactionApplication.java
│   │   ├── controller/
│   │   │   └── TransactionController.java
│   │   ├── service/
│   │   │   └── TransactionService.java
│   │   ├── model/
│   │   │   └── Transaction.java
│   │   ├── repository/
│   │   │   └── TransactionRepository.java
│   │   └── config/
│   │       └── SecurityConfig.java
│   └── src/main/resources/
│       └── application.yml
│
├── docker-compose.yml
└── README.md
```

---

## 🧑‍💻 Author

**Chandra Sekhar Pramod Mahaveer Neelam**  
Java Full Stack Developer  
📧 Email: chandrasekharneelam8@gmail.com  
📞 Phone: +1 940-843-3314  
🔗 [LinkedIn](http://www.linkedin.com/in/chandraneelam5)

---

## 📦 How to Fork and Run This Project

### 🔁 Step 1: Fork the Repository

1. Click the `Fork` button on the top right of this page.
2. Clone your forked repository:

```bash
git clone https://github.com/YOUR-USERNAME/SpringMicroPay.git
cd SpringMicroPay
```

---

### 🛠️ Step 2: Prerequisites

- Java 17
- Docker & Docker Compose
- PostgreSQL (if not using dockerized DB)
- Postman or curl (for testing)

---

### ⚙️ Step 3: Run the Project

Start all microservices and PostgreSQL via Docker Compose:

```bash
docker-compose up --build
```

---

### 🧪 Sample API Usage (after services are running)

#### Login

```bash
curl -X POST http://localhost:8081/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username": "user1", "password": "pass123"}'
```

#### Make a Transaction

```bash
curl -X POST http://localhost:8082/transactions \
  -H "Authorization: Bearer <JWT_TOKEN>" \
  -H "Content-Type: application/json" \
  -d '{"fromAccount": "123", "toAccount": "456", "amount": 100}'
```

---

## ✅ Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss your ideas.

---

## 📝 License

This project is licensed under the Apache License 2.0.
