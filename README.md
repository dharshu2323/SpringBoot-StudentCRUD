# SpringBoot-StudentCRUD

![Spring-Boot-React](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/d2233fa9-aa65-42b3-8e64-548f64701b04)

This is a simple CRUD (Create, Read, Update, Delete) application for managing student records. The project is built using 

🌟Reactjs
🌟SpringBoot
🌟H2 DataBase
🌟Postman

👉Frontend (ReactJS):
 1. Set up your React project using create-react-app
 2. Use Axios(library) to make HTTP requests to your backend.
 3. Implement functions for creating, reading, updating, and deleting students.

![Screenshot (119)](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/019c6165-f25f-46cb-bc8d-e4d05469dbfa)


👉Backend (Spring Boot):
1.Create a new Spring Boot project using Spring Initializer.

![Screenshot (120)](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/089a4502-529c-482f-a6d1-d8afacf729e2)

The dependencies generated in this project are:


1.JPA Repository:Java Persistence API (JPA) is a specification for managing relational data in Java applications.It provides CRUD operations and query methods for interacting with a database.


2.H2 Database:In your Spring Boot application, you can configure H2 as a dependency and use it for storing and retrieving data.It is a online database.


3.Lombok:Lombok provides annotations like @Getter, @Setter, @NoArgsConstructor, @AllArgsConstructor, @EqualsAndHashCode, and others.


4.Spring Web:Spring Web is a part of the larger Spring Framework, providing features for building web applications and RESTful web services.

👉H2 DataBase:
```
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
```

![Screenshot (118)](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/4daffc4c-9709-4c91-abe2-538a1b3e95dc)


👉Postman:

1.Open Postman and create a new request.
2.Enter the URL of your API endpoint (e.g., http://localhost:8080/api/students).
3.Choose the HTTP method (GET, POST, etc.).
4.Add request parameters or a request body if required.
5.Click "Send" to execute the request.
6.View the response.

![Screenshot (116)](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/4835e8b2-8103-4964-81b9-2d074b551404)

👉API Endpoints

GET /api/user: Get a list of all students.
GET /api/users/{id}: Get details of a specific student.
POST /api/user: Add a new student.
PUT /api/userUpdate/{id}: Update an existing student.
DELETE /api/userDelete/{id}: Delete a student.

![Screenshot (121)](https://github.com/dharshu2323/SpringBoot-StudentCRUD/assets/104815447/3d363e9e-a2dc-4406-95b6-5bd9caef9aaa)

The @CrossOrigin annotation in Spring is used to enable Cross-Origin Resource Sharing (CORS) support at the class or method level.

When you're building a web application with a  React on a different domain than your Spring Boot backend, you might encounter CORS issues. 

The @CrossOrigin annotation helps you control how your backend responds to cross-origin requests.



