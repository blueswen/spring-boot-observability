package com.example.app;

import io.prometheus.client.exemplars.tracer.otel_agent.OpenTelemetryAgentSpanContextSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrometheusExemplarSamplerConfiguration {
    @Bean
    public OpenTelemetryAgentSpanContextSupplier openTelemetryAgentSpanContextSupplier() {
        return new OpenTelemetryAgentSpanContextSupplier();
    }
}
