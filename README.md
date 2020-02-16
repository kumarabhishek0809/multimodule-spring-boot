# Tribalscale Spring-Boot Interview

## Tasks

You will be building a small microservice application using Spring Boot 2.2, Java 8 (or higher) and Gradle 5.
The project has been setup for you; for each module, all the dependencies you need have already been included. 
Feel free to add more dependencies if you like.

### Users-Service
- [ ] In the users-service module, add a model for a `User` with fields: first name and last name.
- [ ] In the `User` model, Add a public method `toString()` and a **private** method `getFullName()`.    
`getFullName()` method should return the full name (e.g. `Harry Potter`).    
`toString()` should call and return `getFullName()`.
- [ ] Write a unit test for the `getFullName()` method.
- [ ] In the users-service module, create a `UserController` that has an endpoint `/api/users` and returns a List<User>.
- [ ] Write an integration test for the `/api/users` endpoint.

### Companies-Service

- [ ] Using Spring Initializer, Add a second microservice called `companies-service`.
- [ ] In the companies-service module, add a model for a `Company` with a single field: name. 
- [ ] In companies-service, Write a `CompaniesController` with an endpoint `api/companies` that returns a List<Companies>.

### Registry-Service
- [ ] In the registry-service module, set up a discovery server. 
- [ ] Register companies-service and users-service with the registry-service. 
- [ ] In the `UsersController`, add another endpoint `/api/users/companies`. Call `api/companies` from this endpoint and return the list of companies (Do not hardcode IPs)
- [ ] Write an integration test for the `api/users/companies` endpoint.

### Authorization-Service
- [ ] Setup the authorisation service so that it provides JWT tokens
- [ ] Make the `users-service` a resource server with protected resources: `/api/users` and `/api/users/companies`.
- [ ] Update the integration tests in `users-service` to handle authorization."# multimodule-spring-boot" 
