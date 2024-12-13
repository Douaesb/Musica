# Music Catalog API

## Project Description
This project is a secure REST API for managing a music catalog, allowing for album and song management with different access levels (USER/ADMIN) via stateless authentication. The technical architecture is based on Spring Boot and incorporates modern DevOps practices.

## General Objective
The main objective of this application is to provide a robust REST API for:
- Managing albums and songs
- Managing users and their roles
- Offering enhanced security through authentication and access control
- Integrating tools for continuous deployment

## Project Structure
- **Controllers:** Handle HTTP REST requests
- **Services:** Contain business logic
- **Repositories:** Interact with the database
- **DTOs and Mappers:** Transform entities for API responses
- **Exceptions:** Handle API-specific errors

## Main Entities
### Album
- `title` (String)
- `artist` (String)
- `year` (Integer)

### Song
- `title` (String)
- `duration` (Integer)
- `trackNumber` (Integer)

### User
- `login` (String)
- `password` (String)
- `active` (Boolean)
- `roles` (Collection)

### Relationships
- An album can have multiple songs
- A song belongs to a single album

## Project Features
### Album Management
1. List albums with pagination (USER or ADMIN)
2. Search albums by title with pagination and sorting (USER or ADMIN)
3. Search albums by artist (USER or ADMIN)
4. Filter albums by year with pagination and sorting (USER or ADMIN)
5. Add a new album (ADMIN only)
6. Modify an existing album (ADMIN only)
7. Delete an album (ADMIN only)

**Endpoints:**
- `/api/user/albums/**`
- `/api/admin/albums/**`

### Song Management
1. List songs with pagination (USER or ADMIN)
2. Search songs by title with pagination and sorting (USER or ADMIN)
3. List songs of an album with pagination and sorting (USER or ADMIN)
4. Add a new song (ADMIN only)
5. Modify an existing song (ADMIN only)
6. Delete a song (ADMIN only)

**Endpoints:**
- `/api/user/songs/**`
- `/api/admin/songs/**`

### User Management
1. Authentication: `/api/auth/login`
2. Account creation: `POST /api/auth/register`
3. List users: `GET /api/admin/users` (ADMIN only)
4. Role management: `PUT /api/admin/users/{id}/roles` (ADMIN only)

## Security
- **Stateless Authentication:** JWT-based
- **Password Encryption:** BCryptPasswordEncoder
- **Access Restrictions:**
    - `/api/admin/*` requires ADMIN role
    - `/api/user/*` requires USER role
- **Profiles:**
    - **Dev:** For development and testing
    - **Prod:** For production deployment

## Technologies Used
- **Framework:** Spring Boot
- **API:** REST
- **Database:** MongoDB with Spring Data
- **Security:** Spring Security with JWT
- **Build Tool:** Maven
- **CI/CD:** Jenkins
- **Containerization:** Docker
- **Image Repository:** DockerHub
- **Testing:** JUnit, Mockito
- **API Documentation:** Swagger
- **Development Tools:** Git, JIRA (Scrum), Lombok, Spring Boot DevTools, SonarLint

## Installation and Execution Guide

### Prerequisites
- Java 8 or higher
- Maven
- Docker and Docker Compose
- MongoDB

### Steps to Follow
1. Clone the repository:
   ```bash
   git clone https://github.com/Douaesb/musica.git
   cd musica

2. Build the project:

```shellscript
mvn clean install
```


3. Run the Docker containers:

```shellscript
docker-compose up -d
```


4. Access the application:

1. The API will be available at `http://localhost:8080`
2. Test the endpoints using Postman or other API testing tools


## Testing

- Run unit tests: `mvn test`

- Postman collection for API testing is available in the `postman` directory


## Contact

For any questions or suggestions, please contact:

- **Name:** Douae Sebti
- **Email:** [douae.sb411@gmail.com](mailto:douae.sb411@gmail.com)
- **GitHub:** [Douaesb](https://github.com/Douaesb)

