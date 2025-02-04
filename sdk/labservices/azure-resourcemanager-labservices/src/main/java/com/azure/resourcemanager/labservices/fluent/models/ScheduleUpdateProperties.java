// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.models.RecurrencePattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schedule resource properties used for updates. */
@Fluent
public class ScheduleUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduleUpdateProperties.class);

    /*
     * When lab user virtual machines will be started. Timestamp offsets will
     * be ignored and timeZoneId is used instead.
     */
    @JsonProperty(value = "startAt")
    private OffsetDateTime startAt;

    /*
     * When lab user virtual machines will be stopped. Timestamp offsets will
     * be ignored and timeZoneId is used instead.
     */
    @JsonProperty(value = "stopAt")
    private OffsetDateTime stopAt;

    /*
     * The recurrence pattern of the scheduled actions.
     */
    @JsonProperty(value = "recurrencePattern")
    private RecurrencePattern recurrencePattern;

    /*
     * The IANA timezone id for the schedule.
     */
    @JsonProperty(value = "timeZoneId")
    private String timeZoneId;

    /*
     * Notes for this schedule.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /**
     * Get the startAt property: When lab user virtual machines will be started. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @return the startAt value.
     */
    public OffsetDateTime startAt() {
        return this.startAt;
    }

    /**
     * Set the startAt property: When lab user virtual machines will be started. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @param startAt the startAt value to set.
     * @return the ScheduleUpdateProperties object itself.
     */
    public ScheduleUpdateProperties withStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Get the stopAt property: When lab user virtual machines will be stopped. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @return the stopAt value.
     */
    public OffsetDateTime stopAt() {
        return this.stopAt;
    }

    /**
     * Set the stopAt property: When lab user virtual machines will be stopped. Timestamp offsets will be ignored and
     * timeZoneId is used instead.
     *
     * @param stopAt the stopAt value to set.
     * @return the ScheduleUpdateProperties object itself.
     */
    public ScheduleUpdateProperties withStopAt(OffsetDateTime stopAt) {
        this.stopAt = stopAt;
        return this;
    }

    /**
     * Get the recurrencePattern property: The recurrence pattern of the scheduled actions.
     *
     * @return the recurrencePattern value.
     */
    public RecurrencePattern recurrencePattern() {
        return this.recurrencePattern;
    }

    /**
     * Set the recurrencePattern property: The recurrence pattern of the scheduled actions.
     *
     * @param recurrencePattern the recurrencePattern value to set.
     * @return the ScheduleUpdateProperties object itself.
     */
    public ScheduleUpdateProperties withRecurrencePattern(RecurrencePattern recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
        return this;
    }

    /**
     * Get the timeZoneId property: The IANA timezone id for the schedule.
     *
     * @return the timeZoneId value.
     */
    public String timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the timeZoneId property: The IANA timezone id for the schedule.
     *
     * @param timeZoneId the timeZoneId value to set.
     * @return the ScheduleUpdateProperties object itself.
     */
    public ScheduleUpdateProperties withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * Get the notes property: Notes for this schedule.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: Notes for this schedule.
     *
     * @param notes the notes value to set.
     * @return the ScheduleUpdateProperties object itself.
     */
    public ScheduleUpdateProperties withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrencePattern() != null) {
            recurrencePattern().validate();
        }
    }
}
