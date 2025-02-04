// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The array of costs of a lab services SKU. */
@Immutable
public final class LabServicesSkuCost {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabServicesSkuCost.class);

    /*
     * The meter id.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /*
     * The quantity of units charged.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Float quantity;

    /*
     * The extended unit.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Get the meterId property: The meter id.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the quantity property: The quantity of units charged.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Get the extendedUnit property: The extended unit.
     *
     * @return the extendedUnit value.
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
