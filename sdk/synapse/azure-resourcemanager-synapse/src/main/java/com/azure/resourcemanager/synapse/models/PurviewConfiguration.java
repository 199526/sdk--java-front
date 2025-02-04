// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Purview Configuration. */
@Fluent
public final class PurviewConfiguration {
    /*
     * Purview Resource ID
     */
    @JsonProperty(value = "purviewResourceId")
    private String purviewResourceId;

    /**
     * Get the purviewResourceId property: Purview Resource ID.
     *
     * @return the purviewResourceId value.
     */
    public String purviewResourceId() {
        return this.purviewResourceId;
    }

    /**
     * Set the purviewResourceId property: Purview Resource ID.
     *
     * @param purviewResourceId the purviewResourceId value to set.
     * @return the PurviewConfiguration object itself.
     */
    public PurviewConfiguration withPurviewResourceId(String purviewResourceId) {
        this.purviewResourceId = purviewResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
