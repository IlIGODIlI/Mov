# Configuration Properties Reference

This document details all configuration options for the Bus Transport Management System. Configuration is driven by Spring Boot's application properties, which have been modernized to support environment variables while maintaining standard local defaults.

---

## Environment Variables

You can inject configuration variables directly from your operating system, system containers, or a local `.env` file:

| Environment Variable | Description | Default Local Value |
| :--- | :--- | :--- |
| `SPRING_DATASOURCE_URL` | JDBC URL for connecting to the MySQL server | `jdbc:mysql://localhost:3306/bus_transport` |
| `SPRING_DATASOURCE_USERNAME` | Username for authenticating with MySQL database | `root` |
| `SPRING_DATASOURCE_PASSWORD` | Password for authenticating with MySQL database | `231912` |
| `SERVER_PORT` | Port on which the Spring Boot application listens | `8080` |
| `JWT_SECRET` | Secret key used to sign and verify JSON Web Tokens | `supersecretkeysupersecretkeysupersecretkey123` |

---

## Spring Application Properties (`application.properties`)

Below is the complete reference of configuration properties defined inside the `transport/src/main/resources/application.properties` file:

### 1. General System Configuration
* `spring.application.name`: Sets the name of the service.
  * Value: `transport-management`
* `server.port`: The port binding.
  * Property: `server.port=${SERVER_PORT:8080}`

### 2. Database Connection (MySQL)
* `spring.datasource.url`: The SQL connection string.
  * Property: `spring.datasource.url=${SPRING_DATASOURCE_URL:jdbc:mysql://localhost:3306/bus_transport}`
* `spring.datasource.username`: Database login username.
  * Property: `spring.datasource.username=${SPRING_DATASOURCE_USERNAME:root}`
* `spring.datasource.password`: Database login credentials.
  * Property: `spring.datasource.password=${SPRING_DATASOURCE_PASSWORD:231912}`
* `spring.datasource.driver-class-name`: The JDBC driver.
  * Value: `com.mysql.cj.jdbc.Driver`

### 3. JPA / Hibernate ORM Settings
* `spring.jpa.hibernate.ddl-auto`: Hibernate database schema management.
  * Value: `update` (Instructs Hibernate to validate and update the MySQL schema dynamically on start).
* `spring.jpa.show-sql`: Instructs Hibernate to log database queries to stdout.
  * Value: `true` (Useful for monitoring and debugging queries in local development).
* `spring.jpa.database-platform`: The SQL Dialect engine.
  * Value: `org.hibernate.dialect.MySQLDialect`
