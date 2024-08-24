package com.seba.HealthSync.Metrics;

public record MetricResponse(String message, Long metricId) {
    public MetricResponse(Metrics metric) {
        this( "Metric retrieved successfully", metric.getId());
    }

}
