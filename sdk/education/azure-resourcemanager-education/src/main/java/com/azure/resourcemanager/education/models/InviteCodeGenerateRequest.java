// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** invite code generate request. */
@Fluent
public final class InviteCodeGenerateRequest {
    /*
     * the total number of students that can be accepted to the lab.
     */
    @JsonProperty(value = "maxStudentCount")
    private Float maxStudentCount;

    /**
     * Get the maxStudentCount property: the total number of students that can be accepted to the lab.
     *
     * @return the maxStudentCount value.
     */
    public Float maxStudentCount() {
        return this.maxStudentCount;
    }

    /**
     * Set the maxStudentCount property: the total number of students that can be accepted to the lab.
     *
     * @param maxStudentCount the maxStudentCount value to set.
     * @return the InviteCodeGenerateRequest object itself.
     */
    public InviteCodeGenerateRequest withMaxStudentCount(Float maxStudentCount) {
        this.maxStudentCount = maxStudentCount;
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
