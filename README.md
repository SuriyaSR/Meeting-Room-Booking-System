# 🚀 Meeting Room Booking System

**Java Full Stack Application (Spring Boot + PostgreSQL + React + AWS Deployment)**

## 📌 Project Overview

The Meeting Room Booking System is a full-stack enterprise-style application designed to manage time-based room reservations with strict conflict prevention and transactional consistency.

The system demonstrates backend system design, relational database modeling, secure REST API development, frontend integration and cloud deployment using AWS services.

## 🛠️ Tech Stack
### Backend
- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Security
- PostgreSQL
- Maven

### Frontend
 - React
 - TypeScript
 - Tailwind CSS

### Cloud & Deployment
 - AWS EC2 (Backend Hosting)
 - AWS S3 (Frontend Static Hosting)
 - AWS CloudFront (Global CDN & HTTPS)
 - AWS IAM (Access Control)
 - Nginx (Reverse Proxy – optional production setup)

## 🏗️ Architecture & Design
 - Modular Monolith (feature-based structure)
 - RESTful API design
 - Layered architecture (Controller → Service → Repository)
 - ACID-compliant relational data model
 - Transaction-safe booking logic
 - Backend-driven business validation
 - Cloud-Native Deployment Strategy

The system is structured for scalability and can evolve into microservices if required.

## 🧠 Core Business Logic
### Conflict-Free Booking Engine

The booking module ensures:
 - No overlapping reservations for the same room
 - Server-side validation of time ranges
 - Transactional consistency using Spring @Transactional
 - Indexed queries for performance optimization
 - Referential integrity with foreign key constraints

Domain Relationship:

```bash
User 1 —— N Bookings N —— 1 Room
```

## 🔐 Security Implementation
 - Spring Security configuration
 - Role-based access control (ADMIN / USER)
 - Password hashing using BCrypt
 - Stateless REST design (JWT-ready configuration)
 - Secure AWS Security Group configuration

## 🗄️ Database Design
 - Normalized relational schema
 - Composite indexing for time-range validation
 - Constraint-based data integrity
 - Hibernate schema validation

## 📂 Project Structure
```bash
Meeting-Room-Booking-System/
│
├── Backend/
│   └── meeting-room/
│       ├── user/
│       ├── room/
│       ├── booking/
│       ├── auth/
│       └── config/
│
└── Frontend/ (Planned / In Progress)
```

This feature-based structure improves maintainability and enables clear domain separation.

## ⚙️ Running Locally
### Backend
```bash
cd Backend/meeting-room
mvn spring-boot:run
```

Runs on:
```bash
http://localhost:8080
```
Ensure PostgreSQL is running with configured credentials.

## 📈 Engineering Focus Areas

This project demonstrates:
 - Backend System Design
 - Transaction Management
 - Relational Database Modeling
 - REST API Best Practices
 - Role-Based Security
 - Cloud Deployment on AWS
 - CDN Integration (CloudFront)
 - Infrastructure-Aware Development

## 🔮 Planned Enhancements

 - JWT-based authentication flow
 - RDS-managed PostgreSQL deployment
 - Auto-scaling EC2 configuration
 - CI/CD with GitHub Actions
 - Dockerized backend
 - Redis caching for availability queries

## 👨‍💻 Author

Suriya J

Java Full Stack Developer | Spring Boot | React | AWS
