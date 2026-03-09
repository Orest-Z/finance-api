# Finance API

A simple backend API for managing personal finance categories.
This project is built as a learning project while studying **Spring Boot, PostgreSQL, and REST API development**.

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven

## Features

Currently the API supports basic CRUD operations for **categories**.

Endpoints available:

GET /categories
Returns all categories stored in the database.

POST /categories
Creates a new category.

DELETE /categories/{id}
Deletes a category by its ID.

## Example Category Object

```
{
  "id": 1,
  "userId": 1,
  "name": "Food",
  "type": "EXPENSE"
}
```

## Project Structure

```
src/main/java/com/orest/finance
 ├─ FinanceApiApplication
 ├─ HealthController
 └─ category
     ├─ Category
     ├─ CategoryRepository
     ├─ CategoryService
     └─ CategoryController
 └─ transaction
     ├─ Transaction
     ├─ TransactionRepository
     ├─ TransactionService
     └─ TransactionController
```

## Purpose of the Project

This project is being developed as part of learning backend development with **Spring Boot and relational databases**.
Future improvements will include transactions, user relationships, and additional validation.
