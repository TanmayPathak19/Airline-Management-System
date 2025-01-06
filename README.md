# Airline-Management-System
The Airline Management System is designed to simplify and improve airline operations by automating tasks such as flight scheduling, ticket bookings, and customer management. It aims to reduce human errors and make it easier for both users and administrators to manage information efficiently.

## Project Overview

The Airline Management System is a desktop-based GUI application developed to automate the registration process and management of an airline system. The system allows users to:

- Add passenger records when tickets are reserved.
- Retrieve and manage passenger information.
- View flight information and the list of all passengers.
- Handle transactions related to air travel.

The system efficiently stores and retrieves data using a MySQL database, enabling users to manage a large number of flights and passengers. The application categorizes objects into:

- Airlines
- Airline Employees
- Customers/Travellers

Each object interacts with a database schema containing corresponding tables.

---

## Features

- *AddCustomer.java*: Manages customer data input and adds passenger records to the database.
- *BoardingPass.java*: Generates boarding passes for passengers.
- *BookFlight.java*: Facilitates flight bookings and stores relevant data in the database.
- *CancelFlight.java*: Handles flight cancellations and updates the database accordingly.
- *FlightInfo.java*: Displays detailed information about flights, including schedules and availability.
- *Home.java*: Serves as the main dashboard for navigation across the application.
- *JourneyDetails.java*: Displays information about a traveller's journey, including source, destination, and dates.
- *Login.java*: Provides secure login functionality for system access.

---

## Technologies Used

- *Programming Language*: Java (Core Java)
- *GUI Framework*: Swing
- *Database*: MySQL
- *IDE*: NetBeans

---

## System Requirements

- *Java Development Kit (JDK)* version 8 or higher.
- *NetBeans IDE* version 12 or higher.
- *MySQL Server* version 8.0 or higher.

---

## Installation and Setup

1. Clone this repository to your local machine:
   bash
   git clone https://github.com/TanmayPathak19/airline-management-system.git
   
2. Open the project in NetBeans IDE.
3. Configure the database:
   - Import the provided SQL script into your MySQL server.
   - Update the database connection details in the Java files (e.g., hostname, username, password).
4. Build and run the project in NetBeans.

---

## How to Use

1. Launch the application by running the Home.java file.
2. Login using your credentials via the Login.java interface.
3. Use the dashboard (Home.java) to navigate between functionalities:
   - Add customer details.
   - Book or cancel flights.
   - Generate boarding passes.
   - View flight and journey details.
4. The application interacts with the MySQL database to fetch and store data dynamically.

---

## Database Schema

The database consists of multiple tables to manage:

- Airlines
- Airline Employees
- Customers/Travellers
- Flight Information
- Ticket Bookings

Ensure the database schema aligns with the SQL script provided in the project.

---

## Future Enhancements

- Integrating real-time flight status updates.
- Implementing payment gateway integration.
- Adding advanced search and filter options for flights.

---
