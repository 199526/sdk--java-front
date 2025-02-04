// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for using a user's KeyVault for URL Signing Key. */
@Fluent
public final class KeyVaultSigningKeyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultSigningKeyParameters.class);

    /*
     * The typeName property.
     */
    @JsonProperty(value = "typeName", required = true)
    private String typeName = "KeyVaultSigningKeyParameters";

    /*
     * Subscription Id of the user's Key Vault containing the secret
     */
    @JsonProperty(value = "subscriptionId", required = true)
    private String subscriptionId;

    /*
     * Resource group of the user's Key Vault containing the secret
     */
    @JsonProperty(value = "resourceGroupName", required = true)
    private String resourceGroupName;

    /*
     * The name of the user's Key Vault containing the secret
     */
    @JsonProperty(value = "vaultName", required = true)
    private String vaultName;

    /*
     * The name of secret in Key Vault.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /*
     * The version(GUID) of secret in Key Vault.
     */
    @JsonProperty(value = "secretVersion", required = true)
    private String secretVersion;

    /** Creates an instance of KeyVaultSigningKeyParameters class. */
    public KeyVaultSigningKeyParameters() {
        typeName = "KeyVaultSigningKeyParameters";
    }

    /**
     * Get the typeName property: The typeName property.
     *
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     *
     * @param typeName the typeName value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id of the user's Key Vault containing the secret.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id of the user's Key Vault containing the secret.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Resource group of the user's Key Vault containing the secret.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Resource group of the user's Key Vault containing the secret.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the vaultName property: The name of the user's Key Vault containing the secret.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: The name of the user's Key Vault containing the secret.
     *
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the secretName property: The name of secret in Key Vault.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The name of secret in Key Vault.
     *
     * @param secretName the secretName value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The version(GUID) of secret in Key Vault.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The version(GUID) of secret in Key Vault.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the KeyVaultSigningKeyParameters object itself.
     */
    public KeyVaultSigningKeyParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subscriptionId in model KeyVaultSigningKeyParameters"));
        }
        if (resourceGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceGroupName in model KeyVaultSigningKeyParameters"));
        }
        if (vaultName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vaultName in model KeyVaultSigningKeyParameters"));
        }
        if (secretName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretName in model KeyVaultSigningKeyParameters"));
        }
        if (secretVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretVersion in model KeyVaultSigningKeyParameters"));
        }
    }
}
