# Spring Data JPA with Hibernate using MySql Example
This project depicts the Spring Boot Example with Spring Data JPA with Hibernate using MySql Example.

## Description
This Project shows the list of Users which are stored in the MySql Database. Using the following endpoints, different operations can be achieved:
- `/rest/users/all` - This returns the list of Users in the Users table which is created in MySql Table (users)
- `/rest/users/{name}` - This returns the details of the Users passed in URL
- `/rest/id/{id}` - This returns the details of the Users for the user Id passed in URL
- `/rest/update/{id}/{name}` - This updates the name of the user for the userId passed in the URL

## Libraries used
- Spring Boot
- Spring MVC (Spring Web)
- Spring Data JPA with Hibernate
- MySql

## Tools used
- Git 2.10.0
- IntelliJ IDEA 2017.1
- MySql running locally

## Compilation Command
- `mvn clean install` - Plain maven clean and install
