# HelloCopilotWorld

A simple Spring Boot application created with GitHub Copilot.

## Features

- RESTful API endpoints
- Spring Boot 3.3.0
- Java 21
- Maven build configuration

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+

### Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### API Endpoints

- `GET /` - Returns "Hello Copilot World!"
- `GET /hello?name=YourName` - Returns personalized greeting

### Running Tests

```bash
mvn test
```

## Building

```bash
mvn clean package
```

This will create an executable JAR file in the `target` directory.

## Running the JAR

```bash
java -jar target/hello-copilot-world-1.0.0.jar
```

## Project Structure

```
src/
├── main/
│   ├── java/com/example/
│   │   ├── HelloCopilotWorldApplication.java (Main entry point)
│   │   └── controller/
│   │       └── HelloController.java (REST endpoints)
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/example/
        └── HelloCopilotWorldApplicationTests.java
```

## License

MIT
