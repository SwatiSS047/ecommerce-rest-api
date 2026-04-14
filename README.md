# 🛒 E-Commerce REST API

🚀 Spring Boot backend project for managing users, products, cart, and orders.

A fully functional E-Commerce Backend API built using Spring Boot.
This project manages Users, Products, Categories, Cart, and Orders with a clean layered architecture and global exception handling.

🚀 Features
👤 User Registration & Login
📦 Product Management (CRUD Operations)
📂 Category Management
🛒 Cart Management
📦 Order Placement System
🔄 DTO Conversion (Entity → DTO)
❗ Global Exception Handling
🏗️ Layered Architecture (Controller → Service → Repository)
🛠️ Tech Stack
Backend: Spring Boot
Language: Java
Database: MySQL
ORM: Hibernate (JPA)
Build Tool: Maven
Testing: Postman

📁 Project Structure
src/main/java/com/ecom/Springboot_project/
```
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

🔄 Business Logic
🛒 Cart Flow
User adds product to cart
Stores User + Product + Quantity
📦 Order Flow
Fetch cart items using userId
Convert into OrderItem
Calculate total
Save order
Clear cart

❗ Exception Handling

Handled using GlobalExceptionHandler

Handles:
ResourceNotFoundException → 404
IllegalArgumentException → 400
Exception → 500
Example Response
{
  "message": "Product not found",
  "status": 404
}
🔄 DTO Usage

ProductDto is used to:

Hide internal entity structure
Return clean API response
Improve performance

