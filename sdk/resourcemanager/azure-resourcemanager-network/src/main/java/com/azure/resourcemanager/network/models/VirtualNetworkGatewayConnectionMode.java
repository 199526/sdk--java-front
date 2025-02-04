// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualNetworkGatewayConnectionMode. */
public final class VirtualNetworkGatewayConnectionMode
    extends ExpandableStringEnum<VirtualNetworkGatewayConnectionMode> {
    /** Static value Default for VirtualNetworkGatewayConnectionMode. */
    public static final VirtualNetworkGatewayConnectionMode DEFAULT = fromString("Default");

    /** Static value ResponderOnly for VirtualNetworkGatewayConnectionMode. */
    public static final VirtualNetworkGatewayConnectionMode RESPONDER_ONLY = fromString("ResponderOnly");

    /** Static value InitiatorOnly for VirtualNetworkGatewayConnectionMode. */
    public static final VirtualNetworkGatewayConnectionMode INITIATOR_ONLY = fromString("InitiatorOnly");

    /**
     * Creates or finds a VirtualNetworkGatewayConnectionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkGatewayConnectionMode.
     */
    @JsonCreator
    public static VirtualNetworkGatewayConnectionMode fromString(String name) {
        return fromString(name, VirtualNetworkGatewayConnectionMode.class);
    }

    /**
     * Gets known VirtualNetworkGatewayConnectionMode values.
     *
     * @return known VirtualNetworkGatewayConnectionMode values.
     */
    public static Collection<VirtualNetworkGatewayConnectionMode> values() {
        return values(VirtualNetworkGatewayConnectionMode.class);
    }
}
