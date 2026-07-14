# Installation & Local Setup Guide

Follow these steps to set up, build, and run the Bus Transport Management System locally.

---

## Prerequisites

Before starting, ensure you have the following installed on your machine:
- **Java Development Kit (JDK) 17 or higher** (Oracle JDK, OpenJDK, etc.)
- **Maven 3.6+** (Or use the included Maven Wrapper `mvnw`)
- **MySQL Server 8.0+**
- **Git**

---

## 1. Database Setup

1. Open your MySQL Command Line Client or preferred GUI tool (like MySQL Workbench, DBeaver, or TablePlus).
2. Create a new database named `bus_transport`:
   ```sql
   CREATE DATABASE bus_transport;
   ```
3. The application uses Spring Data JPA's `update` feature (`spring.jpa.hibernate.ddl-auto=update`), meaning all database tables will be automatically generated upon initial application startup. No manual SQL import is needed!

---

## 2. Configuration & Environment Variables

1. Navigate to the repository root directory.
2. Create a copy of the template `.env.example` file and name it `.env`:
   ```bash
   cp .env.example .env
   ```
3. Open the `.env` file and replace the credentials with your local MySQL database configurations if they differ from the defaults:
   - `SPRING_DATASOURCE_URL`: Address of your MySQL server (defaults to `jdbc:mysql://localhost:3306/bus_transport`).
   - `SPRING_DATASOURCE_USERNAME`: Your MySQL username (defaults to `root`).
   - `SPRING_DATASOURCE_PASSWORD`: Your MySQL password (defaults to `231912`).

---

## 3. Building the Application

Using the terminal, navigate to the `transport/` subfolder (which contains the `pom.xml` and Maven configurations) and run:

### Windows (PowerShell / Command Prompt)
```powershell
# Compile classes
.\mvnw.cmd clean compile

# Run tests
.\mvnw.cmd test

# Build executable jar package
.\mvnw.cmd clean package
```

### macOS / Linux
```bash
# Set execute permissions for the wrapper script if needed
chmod +x mvnw

# Compile classes
./mvnw clean compile

# Run tests
./mvnw test

# Build executable jar package
./mvnw clean package
```

---

## 4. Running the Application

### Option A: Run via Maven Boot Plugin
Run the application directly using Maven's build runner from the `transport/` directory:
```bash
# Windows
.\mvnw.cmd spring-boot:run

# macOS / Linux
./mvnw spring-boot:run
```

### Option B: Run Compiled Executable Jar
Once the build is complete, you can find the packaged JAR file inside `transport/target/`. Run it using Java:
```bash
java -jar target/transport-0.0.1-SNAPSHOT.jar
```

Once started, the server runs on **port 8080** by default. Open your web browser and navigate to:
[http://localhost:8080/login.html](http://localhost:8080/login.html) to access the application frontend!
