# Spring Boot Dependency Injection Example

This repository contains a simple Spring Boot project demonstrating various types of **Dependency Injection (DI)** techniques using a REST API. It includes multiple coach types that implement a common interface, showcasing how Spring handles component scanning and bean injection using annotations.

## 🧩 Features

- Spring Boot REST API
- Constructor-based Dependency Injection
- Interface-based polymorphism
- Component scanning with `@Component` and `@Primary`
- REST endpoint `/getDailyWorkout` that returns a workout message depending on the injected coach

## 📂 Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── ruhuna/
                └── demo/
                    ├── DemoApplication.java
                    ├── CoreRestController.java
                    ├── ICoach.java
                    ├── BasketBallCoach.java
                    ├── CricketCoach.java
                    └── FootballCoach.java
```

## 📌 How It Works

- `ICoach` is a simple interface.
- `BasketBallCoach`, `CricketCoach`, and `FootballCoach` implement the `ICoach` interface.
- Spring Boot scans for components using `@Component` annotation and wires them automatically.
- The `CoreRestController` uses constructor injection with `@Autowired` and `@Qualifier` to choose the correct implementation.

## ▶️ Running the Application

```bash
# Step 1: Build the project
./mvnw clean install

# Step 2: Run the Spring Boot app
./mvnw spring-boot:run
```

Then access the API:

```
GET http://localhost:8080/getDailyWorkout
```

You will receive a response like:

```
"Practice 3 points for 15 minutes"
```

## 📚 Learning Purpose

This project is designed to help learners understand:

- Spring DI fundamentals
- REST API building using Spring Boot
- Managing multiple beans and qualifiers

## 🛠️ Technologies

- Java 17+
- Spring Boot
- Maven

---

Made with ❤️ for learning Spring Boot and REST API basics.
