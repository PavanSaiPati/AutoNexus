# AutoNexus
a one-stop hubspot for Da's or driver. Trying to eliminate the differentiation between DA and Ride share driver

## Work Log

### *January 14, 2025*
- **Configured Spring Boot Actuator**:
    - Added the necessary dependencies in `pom.xml`.
    - Enabled specific actuator endpoints for the project, including `/actuator/health` and `/actuator/mappings`.
- **Tested Controller Endpoints**:
    - Verified the response of the `/api/hello` endpoint, ensuring proper integration.
    - Checked and validated the `/actuator/health` and `/actuator/mappings` endpoints for application health and configurations.
- **Resolved GitHub Integration Issues**:
    - Configured **GitHub CLI** for authentication and seamless repository management.
    - Initialized a local Git repository and connected it to the remote repository on GitHub.
    - Successfully pushed the backend folder to the remote repository (`AutoNexus`).

### *January 15, 2025*
- **Implemented Git Workflow**:
    - Addressed merge conflicts and resolved issues with divergent branches.
    - Synced local and remote repositories by rebasing and pushing changes.
- **Planned Project Steps**:
    - Decided on maintaining a daily work log in the `README.md`.
    - Discussed the next steps for building the project backend.
- **Configured PostgreSQL Database**:
    - Installed PostgreSQL on macOS using Homebrew.
    - Initialized the database cluster and started the PostgreSQL service.
---

### *January 20, 2025*

- **PostgreSQL Setup:**
  - Verified PostgreSQL installation on macOS and resolved issues related to database cluster initialization.
  - Successfully initialized PostgreSQL with the default user and created the database `delivery_db`.
  - Connected to the `delivery_db` using `psql` and verified the schema for existing tables.

- **Database Integration:**
  - Configured `application.yml` with PostgreSQL credentials and JPA settings.
  - Verified the schema creation for `users`, `service_entities`, `orders`, `drivers`, `customers`, and `nexus_wallets`.

- **Entity and Repository Adjustments:**
  - Resolved `created_at` and `updated_at` null constraints by updating the `User` class with auditing annotations.
  - Ensured `createdAt` and `updatedAt` fields are auto-populated using `@CreatedDate` and `@LastModifiedDate`.
  - Confirmed inheritance mapping strategy for `User` and its subclasses (e.g., `ServiceEntity`).

- **API Testing:**
  - Configured and tested basic `POST` and `GET` operations for `ServiceEntity` in Postman.
  - Addressed issues with null values in `created_at` by implementing JPA auditing via the `JpaConfig` class.

---

### *January 21, 2025*

- **Spring Security Integration:**
  - Added `spring-boot-starter-security` to secure the application.
  - Configured `SecurityConfig` for basic authentication with `ADMIN` and `USER` roles.
  - Created `InMemoryUserDetailsManager` for initial testing with mock users.

- **Auditing Configuration:**
  - Updated `JpaConfig` to dynamically use the currently authenticated user as the auditor.
  - Resolved return type issues in `AuditorAware` implementation.

- **Dependency Management:**
  - Addressed duplicate dependency issues in `pom.xml` (e.g., `spring-boot-starter-data-jpa`).
  - Verified Maven setup and resolved missing dependency warnings.

- **Code Enhancements:**
  - Updated the `User` class with field validations, auditing annotations, and a debug-friendly `toString` method.
  - Enhanced `ServiceEntity` and `User` classes for seamless integration with database operations.

- **Preparation for Testing:**
  - Finalized the basic backend setup, including security, auditing, and API testing endpoints.
  - Identified next steps for implementing advanced features, such as role-based access control.

---
