# Running the Spring Boot Application Locally

## Prerequisites

1. **Java Development Kit (JDK):**

   - Ensure that you have Java JDK 17 installed on your machine.

2. **PostgreSQL Database:**
   - Install PostgreSQL on your machine or use an existing PostgreSQL server.
   - Create a new database for the application.

## Configuration

1. Navigate to the `src/main/resources` directory.
2. Open the `application.yml` file in a text editor.

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/your_database_name
       username: your_database_username
       password: your_database_password
   ```

## Build the project using Maven:

```bash
./mvnw clean install
```

## Run the project using Maven:

```bash
./mvnw spring-boot:run
```
