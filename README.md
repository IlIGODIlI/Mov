# Bus Transport Management System 🚍

[![Java Build & Test](https://github.com/example/transport/actions/workflows/build-and-test.yml/badge.svg)](https://github.com/example/transport/actions/workflows/build-and-test.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.11-brightgreen)](https://spring.io/projects/spring-boot)

A modern, secure, and robust bus fleet tracking and management system designed for schools, universities, and corporate campuses. The system coordinates admin operations, live driver location streaming, student route memberships, and real-time transit tracking.

---

## 🌟 Key Features

* **Real-time Map Visualizations**: Interactive tracking using Leaflet and stylized map layers.
* **Role-Based Portals**:
  * **Admin**: Define routes, assign drivers/students, configure start/end coordinates, and view system logs.
  * **Driver**: Start active trips and stream live GPS coordinate updates.
  * **Student**: View assigned bus routes, look up active bus coordinates, and calculate a live distance-based ETA.
* **JWT Security**: Stateless, secure user authentication with role authorization filters.
* **Premium Glassmorphic UI**: High-fidelity interface styled with TailwindCSS, featuring a 3D animated noise background rendered in Three.js.

---

## 🗂️ Project Structure

The project has been modernized and restructured into clean directories:

```text
Project_Mov_jav/
│
├── .github/                  # Github workflows & issue/PR templates
│   ├── workflows/            # Build & test CI pipelines
│   └── ISSUE_TEMPLATE/       # Templates for bug reports & features
│
├── docs/                     # Detailed architectural & user guides
│   ├── ARCHITECTURE.md       # Systems design & module relationships
│   ├── INSTALLATION.md       # Detailed guide for local setup
│   ├── API.md                # API endpoints, request schemas & payloads
│   ├── CONFIGURATION.md      # Configuration parameters & environment variables
│   ├── SECURITY.md           # JWT details & security disclosures
│   └── ROADMAP.md            # Upcoming features checklist
│
├── transport/                # Maven & Java Spring Boot service
│   ├── .mvn/                 # Maven wrapper configuration
│   ├── src/                  # Application source code
│   │   ├── main/
│   │   │   ├── java/com/mov/transport/
│   │   │   │   ├── config/      # JWT Filter & Spring Security config
│   │   │   │   ├── controller/  # Rest controller classes (Auth, Driver, etc.)
│   │   │   │   ├── model/       # JPA entity definitions (User, Route, etc.)
│   │   │   │   ├── repository/  # Data repositories (UserRepository, etc.)
│   │   │   │   ├── service/     # Business logic services (RouteService, etc.)
│   │   │   │   └── TransportManagementApplication.java # Entry class
│   │   │   └── resources/
│   │   │       ├── static/      # Frontend files (login.html, admin.html, etc.)
│   │   │       └── application.properties # Main application settings
│   │   └── test/             # JUnit 5 integration tests
│   ├── pom.xml               # Maven configuration & project dependency definitions
│   └── mvnw.cmd              # Maven wrapper scripts
│
├── .env.example              # Template for environment configurations
├── LICENSE                   # Open-source MIT License
├── CONTRIBUTING.md           # Guidelines for new contributors
├── CODE_OF_CONDUCT.md        # Community code of conduct
└── SECURITY.md               # Quick-access security policy
```

---

## 🚀 Quick Start (Under 10 Minutes)

Getting up and running is straightforward. Here are the simplified steps:

### 1. Database Setup
Create a new MySQL database:
```sql
CREATE DATABASE bus_transport;
```

### 2. Environment Setup
Copy the configuration template and customize your MySQL credentials:
```bash
cp .env.example .env
```

### 3. Build & Run
Navigate into the `transport/` subdirectory:
```bash
# Windows PowerShell
.\mvnw.cmd clean package
java -jar target/transport-0.0.1-SNAPSHOT.jar

# macOS / Linux Terminal
chmod +x mvnw
./mvnw clean package
java -jar target/transport-0.0.1-SNAPSHOT.jar
```
Navigate to [http://localhost:8080/login.html](http://localhost:8080/login.html) in your browser.

---

## 📚 Documentation Index

For details on specific parts of the project, please consult our dedicated guides:
* 🗺️ **[System Architecture](file:///C:/Users/aryan/Project_Mov_jav/docs/ARCHITECTURE.md)**: Diagrams showing request flows, component design, and sub-package structures.
* 📦 **[Installation Details](file:///C:/Users/aryan/Project_Mov_jav/docs/INSTALLATION.md)**: Database schemas, environment dependencies, and step-by-step setup guides.
* 🔌 **[API Documentation](file:///C:/Users/aryan/Project_Mov_jav/docs/API.md)**: Comprehensive guide to public, student, driver, and admin HTTP endpoints.
* 🔧 **[Configuration Reference](file:///C:/Users/aryan/Project_Mov_jav/docs/CONFIGURATION.md)**: Details on all `application.properties` settings and environment variable bindings.
* 🔒 **[Security Policy](file:///C:/Users/aryan/Project_Mov_jav/docs/SECURITY.md)**: Information about JWT generation, Spring Security filters, and security practices.
* 🎯 **[Development Roadmap](file:///C:/Users/aryan/Project_Mov_jav/docs/ROADMAP.md)**: Future milestones, including WebSockets, geofencing, and container configurations.

---

## 🛠️ Technology Stack

- **Backend Framework**: Spring Boot 3.5.11 (Java 17)
- **Security**: Spring Security & JSON Web Tokens (JJWT)
- **Data Persistence**: Spring Data JPA & Hibernate
- **Database**: MySQL Server
- **Frontend Utilities**: HTML5, Vanilla JavaScript, TailwindCSS
- **Mapping Libraries**: Leaflet Map Engine & CartoDB Maps
- **Graphics Engine**: Three.js (WebGL background shader)

---

## 🤝 Contributing

Contributions are welcome! Please read our **[Contributing Guidelines](file:///C:/Users/aryan/Project_Mov_jav/CONTRIBUTING.md)** and standard **[Code of Conduct](file:///C:/Users/aryan/Project_Mov_jav/CODE_OF_CONDUCT.md)** before submitting a pull request.

---

## 📄 License

This project is licensed under the MIT License - see the **[LICENSE](file:///C:/Users/aryan/Project_Mov_jav/LICENSE)** file for details.
