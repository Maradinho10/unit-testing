## RESTful service built with Spring Boot 2.x

A sample RESTful customer service built with Spring boot 2.2.2, JPA and JDK 8.
This project is created as a learning exercise with the primary goal of applying unit testing to commonly used tools 
such as Spring Framework, Hibernate/JPA, REST, among others.

## How to start

Clone the [repository](https://github.com/Maradinho10/unit-testing.git) to local. In `unit-testing` folder, run `mvnw spring-boot:run` to start the application.

## The RESTful services

- /contacts HTTP GET - Gets all the contacts

## RESTful service examples

### Find all contacts
```
curl -s -G http://localhost:8080/contacts | json_p

[
    {
        "id": 1,
        "createdDate": "2020-05-13T19:19:14.457+0000",
        "updatedDate": "2020-05-13T19:19:14.457+0000",
        "name": "Andriy Shevchenko",
        "comments": "ACM ex-player",
        "phone": "555-555-55555",
        "dob": "1976-09-29"
    },
    {
        "id": 2,
        "createdDate": "2020-05-13T19:19:14.457+0000",
        "updatedDate": "2020-05-13T19:19:14.457+0000",
        "name": "Lionel Messi",
        "comments": "FCB Player",
        "phone": "555-555-55555",
        "dob": "1987-06-24"
    },
    {
        "id": 3,
        "createdDate": "2020-05-13T19:19:14.457+0000",
        "updatedDate": "2020-05-13T19:19:14.457+0000",
        "name": "Thierry Henry",
        "comments": "Arsenal ex-player",
        "phone": "555-555-55555",
        "dob": "1977-08-17"
    }
]
```
