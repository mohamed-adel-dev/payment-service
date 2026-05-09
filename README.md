# Payment Service Microservice

## Overview

This project is a Payment Microservice built using Spring Boot and MySQL.

The service is responsible for:

- Managing payments
- Tracking payment status
- Handling payment methods
- Supporting microservices architecture

The service communicates with the main ecommerce service using REST APIs.

---

# Technologies Used

## Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

## Database
- MySQL 8

## DevOps
- Docker

---

# Features

- Create Payment
- Payment Status Tracking
- Cash Payment
- Visa/Card Payment
- REST APIs
- MySQL Integration

---

# Project Structure

payment-service/

├── src/
├── Dockerfile
├── pom.xml
└── README.md

---

# Running the Project Locally

## 1. Clone Repository

git clone <your-repository-url>

cd payment-service

---

## 2. Create Database

CREATE DATABASE payment_db;

---

## 3. Configure application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/payment_db

spring.datasource.username=root

spring.datasource.password=your_password

---

## 4. Run Application

mvn spring-boot:run

Runs on:

http://localhost:8081

---

# API Endpoints

## Payment APIs

GET /api/payments

POST /api/payments

POST /api/payments/pay

---

# Docker Setup

## Build Docker Image

docker build -t payment-service .

---

## Run Container

docker run -d -p 8081:8081 --name payment-service payment-service

---

# Payment Example

{
  "method": "VISA",
  "status": "PAID",
  "orderId": 1
}

---

# Future Improvements

- Stripe Integration
- PayPal Integration
- Email Notifications
- API Gateway Integration
- Service Discovery

---

# Author

Mohammed Adel