# Student Management System

## Overview

This project is a Java-based Student Management System developed to demonstrate:

- Builder Design Pattern
- Inheritance and Polymorphism
- Application of SOLID Principles
- Clean, modular, and extensible code design

The system supports different types of students:
- Undergraduate Student
- Graduate Student

Each student type extends the abstract base class `Student`.

---

## Project Structure

StudentManagementSystem/
│
├── Student.java
├── UndergraduateStudent.java
├── GraduateStudent.java
├── Main.java
└── README.md

---

## Design Patterns Used

### 1. Builder Pattern

The Builder Pattern is implemented in:

- `UndergraduateStudent.Builder`
- `GraduateStudent.Builder`

Because students have required and optional attributes, the Builder Pattern:

- Simplifies object creation
- Improves readability
- Avoids constructor overloading
- Allows optional attributes to be set fluently

Example (from Main.java):

```java
UndergraduateStudent undergrad =
        new UndergraduateStudent.Builder(
                "U123",
                "Liyabona Dyantyi",
                "liyabona@email.com",
                "Computer Science")
                .creditHours(6)
                .scholarshipAmount(1000)
                .build();
