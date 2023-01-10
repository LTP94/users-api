# users-api

## Features

This API provides HTTP endpoint's and tools for the following:

* Create a user: `POST/api-users/v1/users`
* Get a user by id: `GET/api-users/v1/users/{id}`

### Details

`POST/api-users/v1/users`

This end-point is called to create a new user.

**Body:**

```json
{
  "name": "Pepito Perez",
  "password": "qwer123",
  "email": "pepe@yahoo.com",
  "role": "ROLE_ADMIN"
}
```

**Where:**

`id` - user id. It is automatically generated.


Returns an empty body with one of the following:

* 201 - Created: Everything worked as expected.
* 400 - Bad Request: the request was unacceptable, often due to missing a required parameter or invalid JSON.
* 404 - Not Found: The requested resource doesn't exist.
* 409 - Conflict: The request conflicts with another request (perhaps due to using the same idempotent key).
* 422 – Unprocessable Entity: if any of the fields are not parsable or the start date is greater than the end date.
* 429 - Too Many Requests: Too many requests hit the API too quickly. We recommend an exponential back-off of your requests.
* 500, 502, 503, 504 - Server Errors: something went wrong on API end (These are rare).


### Technologies used

This project was developed with:

* **Java 11 (Java Development Kit - JDK: 11.0.9)**
* **Spring Boot 2.3.7**
* **Maven**
* **PostgreSQL**


```properties
spring.datasource.username=
spring.datasource.password=
```
