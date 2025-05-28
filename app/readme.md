# Spring Boot Observability Demo Application

## Development Setup

1. Download OpenTelemetry Agent Jar, check the latest version at [OpenTelemetry Java Instrumentation Releases](https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/)

    ```bash
    OTEL_AGENT_VERSION=2.16.0 wget "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar"
    ```

2. Start dependency services using Docker Compose

    ```bash
    docker compose -f ../docker-compose.yaml up -d grafana tempo postgres redis
    ```

3. Build the Spring Boot application

    ```bash
    ./mvnw clean package
    ```

4. Run the Spring Boot application with OpenTelemetry agent

    ```bash
    java -javaagent:opentelemetry-javaagent.jar \
         -Dotel.javaagent.configuration-file=./app/otel.properties \
         -jar target/app-0.0.1.jar \
         --spring.profiles.active=test
    ```
5. Access application and Grafana:

    - Application: <http://localhost:8080/swagger-ui/index.html>
    - Grafana: <http://localhost:3000> (admin/admin)

6. Tear down services

    ```bash
    docker compose -f ../docker-compose.yaml down
    ```
