// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Expiration of the role eligibility schedule. */
@Fluent
public final class RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration {
    /*
     * Type of the role eligibility schedule expiration
     */
    @JsonProperty(value = "type")
    private Type type;

    /*
     * End DateTime of the role eligibility schedule.
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /*
     * Duration of the role eligibility schedule in TimeSpan.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /**
     * Get the type property: Type of the role eligibility schedule expiration.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the role eligibility schedule expiration.
     *
     * @param type the type value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Get the endDateTime property: End DateTime of the role eligibility schedule.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: End DateTime of the role eligibility schedule.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the duration property: Duration of the role eligibility schedule in TimeSpan.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of the role eligibility schedule in TimeSpan.
     *
     * @param duration the duration value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration withDuration(String duration) {
        this.duration = duration;
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
