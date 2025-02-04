// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The ServicePrincipalsAddPasswordRequestBody model. */
@Fluent
public final class ServicePrincipalsAddPasswordRequestBodyInner {
    /*
     * passwordCredential
     */
    @JsonProperty(value = "passwordCredential")
    private MicrosoftGraphPasswordCredentialInner passwordCredential;

    /*
     * Dictionary of <AnyObject>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the passwordCredential property: passwordCredential.
     *
     * @return the passwordCredential value.
     */
    public MicrosoftGraphPasswordCredentialInner passwordCredential() {
        return this.passwordCredential;
    }

    /**
     * Set the passwordCredential property: passwordCredential.
     *
     * @param passwordCredential the passwordCredential value to set.
     * @return the ServicePrincipalsAddPasswordRequestBodyInner object itself.
     */
    public ServicePrincipalsAddPasswordRequestBodyInner withPasswordCredential(
        MicrosoftGraphPasswordCredentialInner passwordCredential) {
        this.passwordCredential = passwordCredential;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ServicePrincipalsAddPasswordRequestBodyInner object itself.
     */
    public ServicePrincipalsAddPasswordRequestBodyInner withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (passwordCredential() != null) {
            passwordCredential().validate();
        }
    }
}
