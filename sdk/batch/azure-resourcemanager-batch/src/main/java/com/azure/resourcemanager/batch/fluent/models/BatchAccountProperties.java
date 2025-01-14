// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.batch.models.AuthenticationMode;
import com.azure.resourcemanager.batch.models.AutoStorageProperties;
import com.azure.resourcemanager.batch.models.EncryptionProperties;
import com.azure.resourcemanager.batch.models.KeyVaultReference;
import com.azure.resourcemanager.batch.models.PoolAllocationMode;
import com.azure.resourcemanager.batch.models.ProvisioningState;
import com.azure.resourcemanager.batch.models.PublicNetworkAccessType;
import com.azure.resourcemanager.batch.models.VirtualMachineFamilyCoreQuota;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Account specific properties. */
@Immutable
public final class BatchAccountProperties {
    /*
     * The account endpoint used to interact with the Batch service.
     */
    @JsonProperty(value = "accountEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String accountEndpoint;

    /*
     * The provisioned state of the resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The allocation mode for creating pools in the Batch account.
     */
    @JsonProperty(value = "poolAllocationMode", access = JsonProperty.Access.WRITE_ONLY)
    private PoolAllocationMode poolAllocationMode;

    /*
     * Identifies the Azure key vault associated with a Batch account.
     */
    @JsonProperty(value = "keyVaultReference", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultReference keyVaultReference;

    /*
     * If not specified, the default value is 'enabled'.
     */
    @JsonProperty(value = "publicNetworkAccess", access = JsonProperty.Access.WRITE_ONLY)
    private PublicNetworkAccessType publicNetworkAccess;

    /*
     * List of private endpoint connections associated with the Batch account
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Contains information about the auto-storage account associated with a
     * Batch account.
     */
    @JsonProperty(value = "autoStorage", access = JsonProperty.Access.WRITE_ONLY)
    private AutoStorageProperties autoStorage;

    /*
     * Configures how customer data is encrypted inside the Batch account. By
     * default, accounts are encrypted using a Microsoft managed key. For
     * additional control, a customer-managed key can be used instead.
     */
    @JsonProperty(value = "encryption", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionProperties encryption;

    /*
     * The dedicated core quota for the Batch account. For accounts with
     * PoolAllocationMode set to UserSubscription, quota is managed on the
     * subscription so this value is not returned.
     */
    @JsonProperty(value = "dedicatedCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer dedicatedCoreQuota;

    /*
     * The Spot/low-priority core quota for the Batch account. For accounts
     * with PoolAllocationMode set to UserSubscription, quota is managed on the
     * subscription so this value is not returned.
     */
    @JsonProperty(value = "lowPriorityCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lowPriorityCoreQuota;

    /*
     * A list of the dedicated core quota per Virtual Machine family for the
     * Batch account. For accounts with PoolAllocationMode set to
     * UserSubscription, quota is managed on the subscription so this value is
     * not returned.
     */
    @JsonProperty(value = "dedicatedCoreQuotaPerVMFamily", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineFamilyCoreQuota> dedicatedCoreQuotaPerVMFamily;

    /*
     * A value indicating whether core quotas per Virtual Machine family are
     * enforced for this account Batch is transitioning its core quota system
     * for dedicated cores to be enforced per Virtual Machine family. During
     * this transitional phase, the dedicated core quota per Virtual Machine
     * family may not yet be enforced. If this flag is false, dedicated core
     * quota is enforced via the old dedicatedCoreQuota property on the account
     * and does not consider Virtual Machine family. If this flag is true,
     * dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily
     * property on the account, and the old dedicatedCoreQuota does not apply.
     */
    @JsonProperty(value = "dedicatedCoreQuotaPerVMFamilyEnforced", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean dedicatedCoreQuotaPerVMFamilyEnforced;

    /*
     * The pool quota for the Batch account.
     */
    @JsonProperty(value = "poolQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer poolQuota;

    /*
     * The active job and job schedule quota for the Batch account.
     */
    @JsonProperty(value = "activeJobAndJobScheduleQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer activeJobAndJobScheduleQuota;

    /*
     * List of allowed authentication modes for the Batch account that can be
     * used to authenticate with the data plane. This does not affect
     * authentication with the control plane.
     */
    @JsonProperty(value = "allowedAuthenticationModes", access = JsonProperty.Access.WRITE_ONLY)
    private List<AuthenticationMode> allowedAuthenticationModes;

    /**
     * Get the accountEndpoint property: The account endpoint used to interact with the Batch service.
     *
     * @return the accountEndpoint value.
     */
    public String accountEndpoint() {
        return this.accountEndpoint;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the poolAllocationMode property: The allocation mode for creating pools in the Batch account.
     *
     * @return the poolAllocationMode value.
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.poolAllocationMode;
    }

    /**
     * Get the keyVaultReference property: Identifies the Azure key vault associated with a Batch account.
     *
     * @return the keyVaultReference value.
     */
    public KeyVaultReference keyVaultReference() {
        return this.keyVaultReference;
    }

    /**
     * Get the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the Batch
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the autoStorage property: Contains information about the auto-storage account associated with a Batch
     * account.
     *
     * @return the autoStorage value.
     */
    public AutoStorageProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Get the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Get the dedicatedCoreQuota property: The dedicated core quota for the Batch account. For accounts with
     * PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuota value.
     */
    public Integer dedicatedCoreQuota() {
        return this.dedicatedCoreQuota;
    }

    /**
     * Get the lowPriorityCoreQuota property: The Spot/low-priority core quota for the Batch account. For accounts with
     * PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the lowPriorityCoreQuota value.
     */
    public Integer lowPriorityCoreQuota() {
        return this.lowPriorityCoreQuota;
    }

    /**
     * Get the dedicatedCoreQuotaPerVMFamily property: A list of the dedicated core quota per Virtual Machine family for
     * the Batch account. For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the
     * subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuotaPerVMFamily value.
     */
    public List<VirtualMachineFamilyCoreQuota> dedicatedCoreQuotaPerVMFamily() {
        return this.dedicatedCoreQuotaPerVMFamily;
    }

    /**
     * Get the dedicatedCoreQuotaPerVMFamilyEnforced property: A value indicating whether core quotas per Virtual
     * Machine family are enforced for this account Batch is transitioning its core quota system for dedicated cores to
     * be enforced per Virtual Machine family. During this transitional phase, the dedicated core quota per Virtual
     * Machine family may not yet be enforced. If this flag is false, dedicated core quota is enforced via the old
     * dedicatedCoreQuota property on the account and does not consider Virtual Machine family. If this flag is true,
     * dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily property on the account, and the old
     * dedicatedCoreQuota does not apply.
     *
     * @return the dedicatedCoreQuotaPerVMFamilyEnforced value.
     */
    public Boolean dedicatedCoreQuotaPerVMFamilyEnforced() {
        return this.dedicatedCoreQuotaPerVMFamilyEnforced;
    }

    /**
     * Get the poolQuota property: The pool quota for the Batch account.
     *
     * @return the poolQuota value.
     */
    public Integer poolQuota() {
        return this.poolQuota;
    }

    /**
     * Get the activeJobAndJobScheduleQuota property: The active job and job schedule quota for the Batch account.
     *
     * @return the activeJobAndJobScheduleQuota value.
     */
    public Integer activeJobAndJobScheduleQuota() {
        return this.activeJobAndJobScheduleQuota;
    }

    /**
     * Get the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @return the allowedAuthenticationModes value.
     */
    public List<AuthenticationMode> allowedAuthenticationModes() {
        return this.allowedAuthenticationModes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultReference() != null) {
            keyVaultReference().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (autoStorage() != null) {
            autoStorage().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (dedicatedCoreQuotaPerVMFamily() != null) {
            dedicatedCoreQuotaPerVMFamily().forEach(e -> e.validate());
        }
    }
}
