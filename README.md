# 💰 Payment Wallet Microservice 🚀  
A scalable, microservices-based Payment Wallet application built with **Spring Boot**.

---

## 📌 About the Project  
This **Payment Wallet System** is a microservices-based application that allows users to:  
✅ Create an account  
✅ Add funds to their wallet  
✅ Transfer money to other users  
✅ Track transaction history  

It follows **clean architecture principles** to ensure **scalability and reliability**.

---

## ⚙️ Tech Stack  
- **Backend:** Java, Spring Boot Microservices (Spring Cloud, Eureka)  
- **Database:** PostgreSQL / MySQL  
- **Messaging:** Kafka (Optional)  
- **Security:** JWT Authentication  
- **Deployment:** Docker, Kubernetes  

---

## 🏛️ Microservices Architecture  
| Service | Description |
|---------|------------|
| 👤 **User Service** | Manages user registration & authentication |
| 💰 **Wallet Service** | Manages user wallet balance |
| 💳 **Transaction Service** | Handles fund transfers & payments |
| ✉️ **Notification Service** | Sends transaction alerts & notifications |

Each microservice communicates **asynchronously** via **RabbitMQ/Kafka**.

---

## 📜 API Endpoints  
### User Service  
- `POST /users/register` → Register a new user  
- `POST /users/login` → Authenticate user  

### Wallet Service  
- `GET /wallet/{userId}` → Get wallet balance  
- `POST /wallet/add-funds` → Add funds to wallet  

### Transaction Service  
- `POST /transaction/transfer` → Transfer money  

### Notification Service  
- `POST /notify` → Send transaction alert  

---

## 🏗️ How to Run the Project  
1️⃣ Clone the repository  
```sh
git clone https://github.com/yourusername/payment-wallet-microservice.git
