// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.SubscriptionQuotaItemInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Subscription Quota Items. */
@Fluent
public final class SubscriptionQuotaItemList {
    /*
     * A list of SubscriptionQuotaItems
     */
    @JsonProperty(value = "value")
    private List<SubscriptionQuotaItemInner> value;

    /**
     * Get the value property: A list of SubscriptionQuotaItems.
     *
     * @return the value value.
     */
    public List<SubscriptionQuotaItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of SubscriptionQuotaItems.
     *
     * @param value the value value to set.
     * @return the SubscriptionQuotaItemList object itself.
     */
    public SubscriptionQuotaItemList withValue(List<SubscriptionQuotaItemInner> value) {
        this.value = value;
        return this;
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
