// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.machinelearning.models.UpdateWorkspaceQuotas;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of update workspace quota. */
@Immutable
public final class UpdateWorkspaceQuotasResultInner {
    /*
     * The list of workspace quota update result.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpdateWorkspaceQuotas> value;

    /*
     * The URI to fetch the next page of workspace quota update result. Call
     * ListNext() with this to fetch the next page of Workspace Quota update
     * result.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of workspace quota update result.
     *
     * @return the value value.
     */
    public List<UpdateWorkspaceQuotas> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of workspace quota update result. Call ListNext() with
     * this to fetch the next page of Workspace Quota update result.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
