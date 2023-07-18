# Registration-API-Spring-Boot

This is a API based Registration project that demonstrates the usage of Spring Boot with H2 database, Error handling, Authentication using jwt, validation, exception handling and Swagger UI.

## Requirements

- Java 17: Make sure you have Java 17 installed on your system. You can download it from the official Oracle website or use a package manager like SDKMAN or Homebrew.
- Spring Boot : 3.1.1
## Installation

Follow these steps to install and run the project:

1. Clone the repository: `git clone <repository_url>`
2. Run the project: Execute `GreenstitchApplication.java` to start the application.
3. Access Swagger UI: Open a web browser and go to `http://localhost:8081/swagger-ui/index.html` for the testing of REST API.
4. Access the H2 database: Open a web browser and go to `http://localhost:8081/h2-console/`.
5. If you see this error `Database "test" not found, either pre-create it or allow remote database creation`. then 
replace the JDBC URL in the h2 database login form with this `jdbc:h2:mem:testdb`.
6. Password for the h2 databse is `testpassword`.

![image](https://github.com/yash-ce/Registration-API-Spring-Boot/assets/66213227/14f775e3-d703-48e8-ab48-2746943cd458)


