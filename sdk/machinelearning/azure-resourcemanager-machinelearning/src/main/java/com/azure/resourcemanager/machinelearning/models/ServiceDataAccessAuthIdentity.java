// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceDataAccessAuthIdentity. */
public final class ServiceDataAccessAuthIdentity extends ExpandableStringEnum<ServiceDataAccessAuthIdentity> {
    /** Static value None for ServiceDataAccessAuthIdentity. */
    public static final ServiceDataAccessAuthIdentity NONE = fromString("None");

    /** Static value WorkspaceSystemAssignedIdentity for ServiceDataAccessAuthIdentity. */
    public static final ServiceDataAccessAuthIdentity WORKSPACE_SYSTEM_ASSIGNED_IDENTITY =
        fromString("WorkspaceSystemAssignedIdentity");

    /** Static value WorkspaceUserAssignedIdentity for ServiceDataAccessAuthIdentity. */
    public static final ServiceDataAccessAuthIdentity WORKSPACE_USER_ASSIGNED_IDENTITY =
        fromString("WorkspaceUserAssignedIdentity");

    /**
     * Creates or finds a ServiceDataAccessAuthIdentity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceDataAccessAuthIdentity.
     */
    @JsonCreator
    public static ServiceDataAccessAuthIdentity fromString(String name) {
        return fromString(name, ServiceDataAccessAuthIdentity.class);
    }

    /**
     * Gets known ServiceDataAccessAuthIdentity values.
     *
     * @return known ServiceDataAccessAuthIdentity values.
     */
    public static Collection<ServiceDataAccessAuthIdentity> values() {
        return values(ServiceDataAccessAuthIdentity.class);
    }
}
