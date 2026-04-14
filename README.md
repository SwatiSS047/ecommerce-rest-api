🛒 E-Commerce REST API (Spring Boot)

A fully functional E-Commerce Backend API built using Spring Boot.
This project handles Users, Products, Categories, Cart, and Orders with proper layered architecture and global exception handling.

🚀 Features
👤 User Registration & Login
📦 Product Management (Add, View, Update, Delete)
📂 Category Management
🛒 Cart Management (Add, Update, Delete)
📦 Order Placement from Cart
🔄 DTO Conversion (Product → ProductDto)
❗ Global Exception Handling
🏗️ Clean Layered Architecture (Controller → Service → Repository)
🛠️ Tech Stack
Backend: Spring Boot
Language: Java
Database: MySQL
ORM: Spring Data JPA (Hibernate)
Build Tool: Maven
Testing Tool: Postman
📁 Project Structure
src/main/java/com/ecom/Springboot_project/
│
├── Controller/
│   ├── UserController
│   ├── ProductController
│   ├── CategoryController
│   ├── CartController
│   └── OrderController
│
├── Service/
│   ├── UserService
│   ├── ProductService
│   ├── CategoryService
│   ├── CartService
│   └── OrderService
│
├── entity/
│   ├── User
│   ├── Product
│   ├── Category
│   ├── Cart
│   ├── Order
│   └── OrderItem
│
├── dto/
│   ├── ProductDto
│   ├── RequestLogin
│   └── ResponseLogin
│
├── exception/
│   ├── GlobalExceptionHandler
│   └── ResourceNotFoundException
│
└── repository/
⚙️ Setup & Installation
1️⃣ Clone the Repository
git clone https://github.com/SwatiSS047/ecommerce-rest-api.git
cd ecommerce-rest-api
2️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Build & Run
mvn clean install
mvn spring-boot:run
📡 API Endpoints
👤 User APIs
POST /users/register → Register user
POST /users/login → Login user
📦 Product APIs
POST /products → Add product
GET /products → Get all products
GET /products/test → Test API
📂 Category APIs
POST /category → Add category
GET /category → Get all categories
DELETE /category/{id} → Delete category
🛒 Cart APIs
POST /cart → Add to cart
PUT /cart/{id} → Update cart
DELETE /cart/{id} → Delete cart
📦 Order APIs
POST /order/place/{userId} → Place order
GET /order/user/{id} → Get user orders
🔄 Business Logic Highlights
🛒 Cart Flow
User adds product to cart
Cart stores User + Product + Quantity
📦 Order Flow
Fetch cart items using userId
Convert cart items → OrderItem
Calculate total amount
Save order
Clear cart after placing order
❗ Exception Handling

This project uses a Global Exception Handler:

Handled Exceptions:
ResourceNotFoundException → 404
IllegalArgumentException → 400
Exception → 500
Example Response:
{
  "message": "Product not found",
  "status": 404
}
🔄 DTO Usage
ProductDto is used to:
Avoid exposing full entity
Return only required fields
Improve API response structure
🧪 Testing

Use Postman to test APIs.

Example:

Register user → /users/register
Login → /users/login
Add product → /products
Add to cart → /cart
Place order → /order/place/{userId}
📈 Future Enhancements
🔐 JWT Authentication & Authorization
💳 Payment Gateway Integration
⭐ Product Reviews & Ratings
📊 Admin Dashboard
🐳 Docker Deployment
