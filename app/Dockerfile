FROM curlimages/curl:8.2.1 AS download
ARG OTEL_AGENT_VERSION="1.32.0"
RUN curl --silent --fail -L "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar" \
    -o "$HOME/opentelemetry-javaagent.jar"

FROM maven:3.8.6-openjdk-8 AS build
ADD . /build
RUN cd /build && mvn package --quiet -DskipTests

FROM openjdk:8-jre-slim
COPY --from=build /build/target/*.jar /app.jar
COPY --from=download /home/curl_user/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENTRYPOINT ["java", \
  "-javaagent:/opentelemetry-javaagent.jar", \
  "-jar", "/app.jar" \
  ]
