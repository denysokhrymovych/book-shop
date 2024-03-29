# Book Shop App
_This API is designed to provide seamless access to a vast collection of books, efficient search functionalities, and secure interactions._

## Table of Contents

- [Introduction](#introduction)
- [️Core Features](#core-features)
- [Technologies](#technologies)
- [Endpoints](#endpoints)
- [Preliminary Setup](#preliminary-setup)
- [Installation](#installation)
- [Challenges and Solutions](#challenges-and-solutions)
- [Possible Improvements](#possible-improvements)
- [Summary](#summary)

## Introduction
_Welcome to the Book Shop App, your go-to resource for an efficient and enjoyable book-shopping experience. This app is designed to provide easy access to a diverse collection of books, offering straightforward features for seamless exploration and secure transactions. Let's delve into the key aspects and functionalities that make our app a reliable platform for book enthusiasts._

## Core Features

1. **Dynamic Book Discovery:** Discover new books effortlessly with advanced search options, including categories, authors, titles, and IDs. Our application prioritizes a tailored exploration experience, allowing users to find books efficiently. The support for pagination ensures a manageable display of search results.

2. **Streamlined Order Management:** Experience smooth order management once you've filled your shopping cart with the books you desire. Our application provides a streamlined system for reviewing and adding orders, ensuring a hassle-free process.

3. **Effortless Shopping Cart:** Effortlessly integrate your favorite books into the shopping cart, where an intuitive interface allows for seamless review, editing, and finalization of your selections. Our fully functional cart empowers users to efficiently manage their choices, enhancing the overall shopping experience.

4. **Secure Transactions:** Shop with confidence through secure and encrypted transactions. Our application prioritizes the privacy and protection of your sensitive information. Robust security measures, including Spring Security, are in place to safeguard data and transactions, ensuring that only authorized users can access critical features.

## Technologies

***Core Framework and Dependencies***

- **Spring Boot:** The foundational framework for creating Java applications, providing convenient tools to streamline development processes.

- **Spring Boot Starter Web:** Encompasses essential dependencies for developing web applications and building RESTful APIs.

- **Spring Boot Starter Data JPA:** Facilitates database access through the Java Persistence API.

- **Spring Security:** Incorporates security functionalities, featuring role-based access control and authentication mechanisms.


***Database Management***

- **MySQL:** Enables connectivity between the application and MySQL database for efficient data storage and retrieval.

- **Liquibase Core:** Ensures a systematic approach to database updates, managing database schema version control and migration.

- **Liquibase Maven Plugin:** Simplifies the incorporation of Liquibase into the Maven build process, ensuring efficient database migrations.


***API Documentation***

- **Springdoc OpenAPI:** Automates the creation and serving of API documentation through the OpenAPI specification.


***Validation***

- **Spring Boot Starter Validation:** Integrates Java Bean Validation with Hibernate Validator to ensure the integrity of data through comprehensive data validation measures.


***Testing***

- **JUnit:** A popular testing framework utilized for creating and executing unit tests, ensuring the reliability and accuracy of the application's components.

- **Mockito:** A testing framework facilitating the creation of test double objects for automated unit testing, enhancing the robustness of test scenarios.

- **Spring Boot Starter Test:** Equips Spring Boot applications with robust testing capabilities, ensuring reliable and efficient testing processes.


***Additional Libraries and Tools***

- **Docker:** Packages applications and their dependencies into containers, ensuring consistency and ease of deployment across various environments.

- **Lombok:** Enhances code conciseness by introducing annotations that automate the generation of common methods, reducing boilerplate code.

- **MapStruct:** Simplifies the transformation of data between DTOs (Data Transfer Objects) and entities.


## Endpoints

**AuthController:** Handles user registration and login requests, supporting both email/password and JWT authentication.
+ `POST: /api/auth/registration` - The endpoint for user registration.
+ `POST: /api/auth/login` - The endpoint for user login.

**BookController:** Handles requests for getting, adding, updating, and deleting books.
+ `GET: /api/books` - The endpoint for retrieving all books with User and Admin authorities.
+ `GET: /api/books/{id}` - The endpoint for searching a specific book by ID with User and Admin authorities.
+ `POST: /api/books` - The endpoint for creating new books with Admin authority.
+ `PUT: /api/books/{id}` - The endpoint for updating book information with Admin authority.
+ `DELETE: /api/books/{id}` - The endpoint for deleting books with Admin authority.

**CategoryController:** Handles requests for getting, adding, updating categories, and retrieving all books by category.
+ `GET: /api/categories` - The endpoint for retrieving all categories with User and Admin authorities.
+ `GET: /api/categories/{id}` - The endpoint for retrieving a specific category by its ID with User and Admin authorities.
+ `POST: /api/categories` - The endpoint for creating a new category with Admin authority.
+ `PUT: /api/categories/{id}` - The endpoint for updating category information with Admin authority.
+ `DELETE: /api/categories/{id}` - The endpoint for deleting categories with Admin authority.
+ `GET: /api/categories/{id}/books` - The endpoint for retrieving books by a category ID with User and Admin authorities.

**OrderController:** Handles requests for creating, retrieving, and updating orders, including the modification of order status.
+ `GET: /api/orders` - The endpoint for retrieving order history with User authority.
+ `POST: /api/orders` - The endpoint for placing orders with User authority.
+ `PATCH: /api/orders/{id}` - The endpoint for updating an order status with Admin authority.
+ `GET: /api/orders/{order-id}/items` - The endpoint for retrieving order items from a specific order with User authority.
+ `GET: /api/orders/{order-id}/items/{item-id}` - The endpoint for retrieving a specific item from an order with User authority.

**ShoppingCartController:** Handles requests for adding, deleting, and updating books in the shopping cart, as well as retrieving the user's shopping cart.
+ `GET: /api/cart` - The endpoint for retrieving all items in a shopping cart with User authority.
+ `POST: /api/cart` - The endpoint for adding items to a shopping cart with User authority.
+ `PUT: /api/cart/cart-items/{cartItemId}` - The endpoint for updating the item quantity with User authority.
+ `DELETE: /api/cart/cart-items/{cartItemId}` - The endpoint for deleting items from a shopping cart with User authority.


## Preliminary Setup

Before you embark on the installation and utilization of the Book Shop App, ensure that your system meets the following criteria:

- Java 17 [Download Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Docker [Download Docker](https://www.docker.com/)


## Installation

To start using the Book Shop App, follow these steps:

1. Clone the repository:
    - Open your preferred IDE
    - Navigate to File → New → Project from Version Control
    - Insert the repository link: [https://github.com/denysokhrymovych/book-shop](https://github.com/denysokhrymovych/book-shop)
    - Alternatively, clone from the console with this command: `git clone https://github.com/denysokhrymovych/book-shop`
2. Build the project and download dependencies using Maven:
    - Open a terminal or command prompt
    - Navigate to the project directory
    - Run this command: `mvn clean install`
3. Use Docker Compose:
    - Run the following commands: `docker compose build` and `docker compose up`


## Challenges and Solutions

### Challenge 1: Core Functionalities Implementation

**Problem:** Developing core functionalities such as shopping cart management, order processing, and book discovery required a well-designed implementation to ensure seamless user interaction.

**Solution:** Spring Boot and related technologies were leveraged to implement features like shopping cart handling, order management, and dynamic book discovery. The use of DTO patterns and Spring Data JPA facilitated building adaptable views from our domain models.


### Challenge 2: Security and Authorization

**Problem:** Establishing robust security measures and ensuring proper user authorization were critical for protecting user data and system integrity.

**Solution:** Spring Security was implemented for role-based access control and authentication mechanisms. JWT tokens were utilized to enhance security, providing a secure and efficient method for user authentication.


### Challenge 3: Exception Handling and Error Reporting

**Problem:** Effective handling of errors and systematic reporting of exceptions at the application-wide level were essential for a reliable and user-friendly experience.

**Solution:** A global exception handler and custom exceptions were developed to ensure systematic error handling. This approach enhances error reporting and provides clear feedback.


### Challenge 4: Testing Rigorousness

**Problem:** Ensuring comprehensive test coverage is very important for application reliability. However, achieving thorough testing becomes challenging when dealing with intricate business logic and diverse functionalities.

**Solution:** The testing challenge was addressed systematically. JUnit for unit tests and Mockito for creating effective test double objects were employed.



## Possible Improvements

**Advanced Search Features:** Additional search parameters or filters could be considered to assist users in discovering books more efficiently based on their preferences.

**Real-time Notification Integration:** The introduction of real-time notifications for order updates and relevant information could enhance user engagement.

**External API Integration:** Exploring possibilities to integrate with external book-related APIs may expand the catalog and enrich data.

**User Feedback Mechanism:** Consideration of a feedback mechanism could provide valuable insights from users, contributing to continuous improvement aligned with user preferences and suggestions.

**Personalized Recommendation System:** A personalized recommendation system might enhance the user experience by offering tailored book suggestions derived from their browsing and purchase history.


## Summary

The Book Shop App is designed to simplify book discovery, order management, and secure transactions. Leveraging Spring Boot and related technologies, the application ensures a straightforward and secure shopping experience.

In addressing challenges related to data modeling and security, pragmatic solutions were implemented. The integration of Spring Security and JWT tokens enhances data protection, while systematic error handling and detailed configuration documentation contribute to a reliable system.
