# 🛒 E-Commerce REST API (Spring Boot)

A fully functional **E-Commerce Backend API** built using **Spring Boot**.  
This project manages **Users, Products, Categories, Cart, and Orders** with clean architecture and exception handling.

---

## 🚀 Features

- 👤 User Registration & Login  
- 📦 Product Management (CRUD)  
- 📂 Category Management  
- 🛒 Cart Management  
- 📦 Order Placement  
- 🔄 DTO Conversion  
- ❗ Global Exception Handling  
- 🏗️ Layered Architecture  

---

## 🛠️ Tech Stack

- Backend: Spring Boot  
- Language: Java  
- Database: MySQL  
- ORM: Hibernate (JPA)  
- Build Tool: Maven  
- Testing: Postman  

---

## 📁 Project Structure


src/main/java/com/ecom/Springboot_project/

# 🛒 E-Commerce REST API (Spring Boot)

A fully functional **E-Commerce Backend API** built using **Spring Boot**.  
This project manages **Users, Products, Categories, Cart, and Orders** with clean architecture and exception handling.

---

## 🚀 Features

- 👤 User Registration & Login  
- 📦 Product Management (CRUD)  
- 📂 Category Management  
- 🛒 Cart Management  
- 📦 Order Placement  
- 🔄 DTO Conversion  
- ❗ Global Exception Handling  
- 🏗️ Layered Architecture  

---

## 🛠️ Tech Stack

- Backend: Spring Boot  
- Language: Java  
- Database: MySQL  
- ORM: Hibernate (JPA)  
- Build Tool: Maven  
- Testing: Postman  

---

## 📁 Project Structure
# 🛒 E-Commerce REST API (Spring Boot)

A fully functional **E-Commerce Backend API** built using **Spring Boot**.  
This project manages **Users, Products, Categories, Cart, and Orders** with clean architecture and exception handling.

---

## 🚀 Features

- 👤 User Registration & Login  
- 📦 Product Management (CRUD)  
- 📂 Category Management  
- 🛒 Cart Management  
- 📦 Order Placement  
- 🔄 DTO Conversion  
- ❗ Global Exception Handling  
- 🏗️ Layered Architecture  

---

## 🛠️ Tech Stack

- Backend: Spring Boot  
- Language: Java  
- Database: MySQL  
- ORM: Hibernate (JPA)  
- Build Tool: Maven  
- Testing: Postman  

---

## 📁 Project Structure
```
src/main/java/com/ecom/Springboot_project/

├── Controller/
│   ├── UserController
│   ├── ProductController
│   ├── CategoryController
│   ├── CartController
│   └── OrderController

├── Service/
│   ├── UserService
│   ├── ProductService
│   ├── CategoryService
│   ├── CartService
│   └── OrderService

├── entity/
│   ├── User
│   ├── Product
│   ├── Category
│   ├── Cart
│   ├── Order
│   └── OrderItem

├── dto/
│   ├── ProductDto
│   ├── RequestLogin
│   └── ResponseLogin

├── exception/
│   ├── GlobalExceptionHandler
│   └── ResourceNotFoundException

└── repository/
```
---

❗ Exception Handling

Handled using GlobalExceptionHandler

404 → ResourceNotFoundException

400 → IllegalArgumentException

500 → General Exception

