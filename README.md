# Account-Application

I implemented a Web-based Account Application, which allows customers to open a new account and access customer information and transactions. I set the Model Layer as Account, Customer and Transaction. Since the model and Dto layer of the project realized in Layered Architecture are fully immutable, I made it in Kotlin for data security and the rest of the project in Spring Boot. I did Unit and Integration tests. I performed Exception Handling operations. I used the H2 in-memory database. I performed Authentication and Authorization with Spring Security Basic. I made the Front-End of the project using React Js. I turned the project into a Docker Container by writing the Dockerfile.

# Account API For Existing Customer
___
### Spring Boot and ReactJS Application

---
This project provides to create account for existing customers.

### Summary
The assessment consists of an API to be used for opening a new “current account” of already existing
customers.

#### Requirements

• The API will expose an endpoint which accepts the user information (customerID,
initialCredit).

• Once the endpoint is called, a new account will be opened connected to the user whose ID is
customerID.

• Also, if initialCredit is not 0, a transaction will be sent to the new account.

• Another Endpoint will output the user information showing Name, Surname, balance, and
transactions of the accounts.
___
The application has 2 apis
* AccountAPI
* CustomerAPI

```html
POST /v1/account - creates a new account for existing customer
GET /v1/customer/{customerId} - retrieves a customer
GET /v1/customer - retrieves all customers
```

JUnit test coverage is 100% as well as integration tests are available.


### Tech Stack

---
- Java 11
- Spring Boot
- Spring Data JPA
- Kotlin 1.5.0
- Restful API
- OpenAPI documentation
- H2 In memory database  
- Docker
- Docker compose
- JUnit 5
- ReactJS for frontend

### Prerequisites

---
- Maven
- Docker


### Run & Build
#### Maven

For maven usage, you need to change `proxy` value in the `account-fe/package.json` 
file by `"http://localhost:8080"` due to the default value has been settled for docker image network proxy.
___
*$PORT: 8080*
```ssh
$ cd account/account-api
$ mvn clean install
$ mvn spring-boot:run

$ cd account/account-fe
$ npm install
$ npm start
```

### Swagger UI will be run on this url
`http://localhost:${PORT}/swagger-ui.html`
