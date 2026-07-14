# Development Roadmap

This roadmap lists planned enhancements, security hardening, and feature extensions for the Bus Transport Management System.

---

## Phase 1: Security Hardening

- [ ] **Password Hashing**: Integrate BCryptPasswordEncoder to encrypt user passwords prior to saving them in the database.
- [ ] **Secure JWT Secrets**: Retrieve JWT signing keys dynamically from environment properties (`JWT_SECRET`) instead of hardcoding them.
- [ ] **Token Blacklisting**: Implement a Redis-backed token revocation store to support user logout and session invalidation.

---

## Phase 2: Real-time Features & UX

- [ ] **WebSocket Fleet Tracking**: Replace HTTP polling of coordinates with a WebSocket broker (STOMP / SockJS) for real-time location streaming.
- [ ] **Mobile Interface**: Build a responsive mobile app or wrapper using React Native or Progressive Web App (PWA) guidelines.
- [ ] **Map Clustering & Geofencing**: Introduce Leaflet clustering for high-density routes and set up triggers/notifications when a bus approaches a student's stop.

---

## Phase 3: Operations & Infrastructure

- [ ] **Multi-Database Support**: Provide Flyway migrations and profiles for PostgreSQL and H2 (in-memory testing) databases.
- [ ] **Containerization**: Create a multi-stage `Dockerfile` and `docker-compose.yml` to spin up MySQL and the Java service instantly.
- [ ] **CI/CD Pipelines**: Deploy automated builds, artifact releases, and staging deployments using GitHub Actions.
