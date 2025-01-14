// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Response of getting a model. */
@Fluent
public final class Model {
    /*
     * Model identifier.
     */
    @JsonProperty(value = "modelId", required = true)
    private UUID modelId;

    /*
     * Date and time (UTC) when the model was created.
     */
    @JsonProperty(value = "createdTime", required = true)
    private OffsetDateTime createdTime;

    /*
     * Date and time (UTC) when the model was last updated.
     */
    @JsonProperty(value = "lastUpdatedTime", required = true)
    private OffsetDateTime lastUpdatedTime;

    /*
     * Train result of a model including status, errors and diagnose info for
     * model and variables.
     */
    @JsonProperty(value = "modelInfo")
    private ModelInfo modelInfo;

    /**
     * Get the modelId property: Model identifier.
     *
     * @return the modelId value.
     */
    public UUID getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Model identifier.
     *
     * @param modelId the modelId value to set.
     * @return the Model object itself.
     */
    public Model setModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the createdTime property: Date and time (UTC) when the model was created.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: Date and time (UTC) when the model was created.
     *
     * @param createdTime the createdTime value to set.
     * @return the Model object itself.
     */
    public Model setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Date and time (UTC) when the model was last updated.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: Date and time (UTC) when the model was last updated.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the Model object itself.
     */
    public Model setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the modelInfo property: Train result of a model including status, errors and diagnose info for model and
     * variables.
     *
     * @return the modelInfo value.
     */
    public ModelInfo getModelInfo() {
        return this.modelInfo;
    }

    /**
     * Set the modelInfo property: Train result of a model including status, errors and diagnose info for model and
     * variables.
     *
     * @param modelInfo the modelInfo value to set.
     * @return the Model object itself.
     */
    public Model setModelInfo(ModelInfo modelInfo) {
        this.modelInfo = modelInfo;
        return this;
    }
}
