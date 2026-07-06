````markdown
# 🏋️ AI Fitness Tracker

An AI-powered Fitness Tracker built using a **Microservices Architecture**. The application helps users track workouts, monitor nutrition, manage fitness goals, and receive AI-powered recommendations. The backend is developed with **Java Spring Boot Microservices**, while the frontend is built with **React.js**.

---

## 🚀 Features

- 👤 User Authentication & Authorization (JWT)
- 🏃 Workout Tracking
- 🍎 Nutrition & Meal Tracking
- 📊 Fitness Progress Analytics
- 🎯 Goal Management
- 🤖 AI-based Workout & Diet Recommendations
- 📅 Daily Activity Tracking
- 🔔 Notifications & Reminders
- 📈 Dashboard with Charts
- 🔍 Search & Filter
- 📱 Responsive UI

---

# 🏗️ Architecture

The project follows **Microservices Architecture**.

```
                    +------------------+
                    |   React Frontend |
                    +--------+---------+
                             |
                             |
                     API Gateway
                             |
       -------------------------------------------------
       |        |         |         |         |         |
   Auth MS  User MS  Workout MS Nutrition MS AI MS Progress MS
       |        |         |         |         |         |
       -------------------------------------------------
                             |
                    Config Server
                             |
                       Eureka Server
```

---

# 🛠️ Tech Stack

## Backend

- Java 21
- Spring Boot 3
- Spring Security
- Spring Cloud
- Spring Data JPA
- Spring Data MongoDB
- Hibernate
- JWT Authentication
- REST APIs
- Maven

## Frontend

- React.js
- React Router
- Axios
- CSS
- Bootstrap

## Databases

- PostgreSQL
- MongoDB

## Tools

- Git
- GitHub
- IntelliJ IDEA
- VS Code
- Postman
- Maven

---

# 📦 Microservices

| Service | Description | Database |
|----------|-------------|-----------|
| API Gateway | Routes requests to services | - |
| Config Server | Centralized configuration | - |
| Eureka Server | Service Discovery | - |
| Auth Service | Authentication, JWT, Roles | PostgreSQL |
| User Service | User Profile Management | PostgreSQL |
| Workout Service | Workout Plans & Logs | MongoDB |
| Nutrition Service | Meals & Calories | MongoDB |
| Progress Service | Progress Tracking | PostgreSQL |
| AI Recommendation Service | AI Workout & Diet Suggestions | MongoDB |
| Notification Service | Notifications & Reminders | PostgreSQL |

---

# 📂 Project Structure

```
AI-Fitness-Tracker/
│
├── api-gateway/
├── config-server/
├── eureka-server/
├── auth-service/
├── user-service/
├── workout-service/
├── nutrition-service/
├── progress-service/
├── ai-recommendation-service/
├── notification-service/
├── frontend/
└── README.md
```

---

# 🔐 Authentication

- JWT Authentication
- Refresh Tokens
- Role-Based Access Control (RBAC)
- Secure Password Encryption
- Spring Security

---

# 🗄️ Database

## PostgreSQL

Used for:

- Users
- Authentication
- Goals
- Progress
- Notifications

## MongoDB

Used for:

- Workouts
- Exercise Library
- Meal Logs
- AI Recommendations

---

# ⚙️ Installation

## Clone Repository

```bash
git clone https://github.com/yourusername/ai-fitness-tracker.git

cd ai-fitness-tracker
```

---

## Backend Setup

### Start PostgreSQL

Create databases.

Example:

```
fitness_auth
fitness_user
fitness_progress
fitness_notification
```

---

### Start MongoDB

Create databases.

Example:

```
fitness_workout
fitness_nutrition
fitness_ai
```

---

### Start Config Server

```bash
cd config-server

mvn spring-boot:run
```

---

### Start Eureka Server

```bash
cd eureka-server

mvn spring-boot:run
```

---

### Start API Gateway

```bash
cd api-gateway

mvn spring-boot:run
```

---

### Start Microservices

Run each service.

```bash
cd auth-service
mvn spring-boot:run
```

Repeat for:

- user-service
- workout-service
- nutrition-service
- progress-service
- ai-recommendation-service
- notification-service

---

## Frontend

```bash
cd frontend

npm install

npm start
```

---

# 🌐 Default Ports

| Service | Port |
|----------|------|
| Config Server | 8888 |
| Eureka Server | 8761 |
| API Gateway | 8080 |
| Auth Service | 8081 |
| User Service | 8082 |
| Workout Service | 8083 |
| Nutrition Service | 8084 |
| Progress Service | 8085 |
| AI Recommendation Service | 8086 |
| Notification Service | 8087 |
| React Frontend | 3000 |

---

# 📡 API Flow

```
React Frontend
       │
       ▼
API Gateway
       │
       ▼
Microservices
       │
       ▼
MongoDB / PostgreSQL
```

---

# 🤖 AI Features

- Personalized workout plans
- AI diet recommendations
- Calorie prediction
- BMI analysis
- Daily fitness insights
- Goal suggestions
- Performance recommendations

---

# 📸 Screenshots

```
Login Page

Dashboard

Workout Page

Nutrition Page

Analytics Dashboard

Profile Page
```

(Add screenshots here)

---

# 🧪 Testing

- Postman API Testing
- Unit Testing
- Integration Testing

---

# 🚀 Future Enhancements

- Google Fit Integration
- Apple Health Integration
- Wearable Device Support
- AI Chatbot Coach
- Voice Commands
- Video Exercise Detection
- Real-Time Activity Tracking
- Payment & Premium Plans

---

# 👨‍💻 Author

**Manoj Kumar**

- Java Developer
- Full Stack Developer
- Spring Boot | React | Microservices | PostgreSQL | MongoDB

---

# ⭐ Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a new feature branch.
3. Commit your changes.
4. Push to your branch.
5. Open a Pull Request.

---

# 📄 License

This project is licensed under the MIT License.

---

## ⭐ If you like this project, don't forget to star the repository!
```
````
