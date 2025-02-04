// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.opentelemetry.exporter.implementation.builders;

import com.azure.monitor.opentelemetry.exporter.implementation.models.SeverityLevel;
import com.azure.monitor.opentelemetry.exporter.implementation.models.TelemetryExceptionData;
import com.azure.monitor.opentelemetry.exporter.implementation.models.TelemetryExceptionDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ExceptionTelemetryBuilder extends AbstractTelemetryBuilder {

    private static final int MAX_PROBLEM_ID_LENGTH = 1024;

    private final TelemetryExceptionData data;

    public static ExceptionTelemetryBuilder create() {
        return new ExceptionTelemetryBuilder(new TelemetryExceptionData());
    }

    private ExceptionTelemetryBuilder(TelemetryExceptionData data) {
        super(data, "Exception", "ExceptionData");
        this.data = data;
    }

    public void setExceptions(List<ExceptionDetailBuilder> builders) {
        List<TelemetryExceptionDetails> details = new ArrayList<>();
        for (ExceptionDetailBuilder builder : builders) {
            details.add(builder.build());
        }
        data.setExceptions(details);
    }

    public void setSeverityLevel(SeverityLevel severityLevel) {
        data.setSeverityLevel(severityLevel);
    }

    public void setProblemId(String problemId) {
        data.setProblemId(TelemetryTruncation.truncateTelemetry(problemId, MAX_PROBLEM_ID_LENGTH, "Exception.problemId"));
    }

    public void addMeasurement(String key, Double value) {
        if (key == null || key.isEmpty() || key.length() > MAX_MEASUREMENT_KEY_LENGTH) {
            // TODO (trask) log
            return;
        }
        Map<String, Double> measurements = data.getMeasurements();
        if (measurements == null) {
            measurements = new HashMap<>();
            data.setMeasurements(measurements);
        }
        measurements.put(key, value);
    }

    @Override
    protected Map<String, String> getProperties() {
        Map<String, String> properties = data.getProperties();
        if (properties == null) {
            properties = new HashMap<>();
            data.setProperties(properties);
        }
        return properties;
    }
}
