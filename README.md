# StreetFoodSupply
A full-stack Java + Spring Boot web application that connects local raw material suppliers with street food vendors (customers) via a clean, responsive frontend. This system streamlines order placement, viewing, and management for admin, supplier, and customer roles, making it ideal for small-scale businesses or hackathon projects.

📌 Features

👤 Login Role-Based Navigation
Select role: Admin, Customer, or Supplier

Each user is routed to a separate dashboard page with relevant functionality

🛒 Customer Features

View all registered suppliers

Place orders by selecting raw materials

Orders are saved in the backend and linked to selected suppliers

🏪 Supplier Features

View all customers who ordered from them

Filter orders based on supplier ID or name

Fully responsive UI with supplier profile details

🧑‍💼 Admin Features

View all customers

View all suppliers

Expand/collapse sections with smooth transitions

One-click back-to-dashboard

⚙️ Tech Stack


Layer	Technology
Backend	Java 21, Spring Boot 3.5.0
Frontend	HTML, CSS, JavaScript
Database	MySQL
ORM	JPA + Hibernate
Build	Maven
Testing	Postman (for API testing)
Hosting	Localhost (default port 8080)

📁 Project Structure

bash
Copy code
StreetFoodSupply/
├── src/
│   └── main/

│       └── java/

│           └── com.SpringMVC.SpringBootApplication/

│               ├── Entity/

│               │   ├── Customer.java

│               │   └── Supplier.java

│               ├── repository/

│               │   ├── CustomerRepository.java

│               │   └── SupplierRepository.java

│               ├── service/

│               │   ├── CustomerService.java

│               │   └── SupplierService.java

│               └── controller/

│                   ├── CustomerController.java

│                   └── SupplierController.java

├── frontend/

│   ├── index.html

│   ├── customer.html

│   ├── supplier.html

│   ├── admin.html

│   └── style.css (inline or separate)

└── application.properties

🛠️ Setup Instructions

🔧 Backend (Spring Boot + MySQL)





🔄 API Endpoints (Spring Boot)


Method	Endpoint	Description

POST	/api/customer/add	Add new customer & link to supplier

GET	/api/customer/allCustomer	Get all customers

GET	/api/customer/supplier/{id}	Get customers of a specific supplier

PUT	/api/customer/{id}	Update customer

DELETE	/api/customer/{id}	Delete customer

GET	/api/suppliers/allSupliers	List all suppliers

POST	/api/suppliers/add	Add new supplier

PUT	/api/suppliers/{id}	Update supplier

DELETE	/api/suppliers/{id}	Delete supplier



💡 Future Improvements

Add proper authentication and role-based login (Spring Security)

Supplier analytics dashboard

Order delivery status tracking

Deploy on cloud (Heroku, Render, Vercel)

🤝 Acknowledgments

Built as part of a hackathon project to support local food vendors

Inspired by real-world supply chain gaps faced by small food businesses

🧑‍💻 Developed By
Vaishnavi Bargaje
Snehal Kendre
Prapti Gadilkar
Tech Stack: Java | Spring Boot | MySQL | HTML | JS | CSS
