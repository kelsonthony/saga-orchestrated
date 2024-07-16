
# Project SAGA Orchestrated with Spring Boot, Kafka, and Hexagonal Architecture

## Overview
This project is a Spring Boot application that uses Kafka for event-driven communication. It includes a domain model for orders and integrates with a MySQL database.

## Technology Stack

### Languages
- Java

### Frameworks and Libraries
- Spring Boot
- Spring Data JPA
- Spring Kafka
- Lombok

### Database
- MySQL

### Build Tool
- Maven

### Messaging
- Apache Kafka

## Project Structure
- `src/main/java/com/kelsonthony/sagaorchestrated/domain/model/Order.java`: Domain model for orders.
- `src/main/java/com/kelsonthony/sagaorchestrated/infrastructure/kafka/producer/OrderEventProducer.java`: Kafka producer for order events.
- `db/migration/V01__create-table-order.sql`: SQL migration script for creating the `order` table.

## Configuration
- Ensure MySQL is running and accessible.
- Kafka should be set up and running.

## Running the Project
1. Clone the repository.
2. Configure the database and Kafka settings in `application.properties`.
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Additional Information
- The `order` table name is escaped using backticks due to `order` being a reserved keyword in SQL.
- Ensure that all SQL queries referencing the `order` table use backticks.

```