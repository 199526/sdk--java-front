// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Permissions. */
public final class Permissions extends ExpandableStringEnum<Permissions> {
    /** Static value r for Permissions. */
    public static final Permissions R = fromString("r");

    /** Static value d for Permissions. */
    public static final Permissions D = fromString("d");

    /** Static value w for Permissions. */
    public static final Permissions W = fromString("w");

    /** Static value l for Permissions. */
    public static final Permissions L = fromString("l");

    /** Static value a for Permissions. */
    public static final Permissions A = fromString("a");

    /** Static value c for Permissions. */
    public static final Permissions C = fromString("c");

    /** Static value u for Permissions. */
    public static final Permissions U = fromString("u");

    /** Static value p for Permissions. */
    public static final Permissions P = fromString("p");

    /**
     * Creates or finds a Permissions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Permissions.
     */
    @JsonCreator
    public static Permissions fromString(String name) {
        return fromString(name, Permissions.class);
    }

    /**
     * Gets known Permissions values.
     *
     * @return known Permissions values.
     */
    public static Collection<Permissions> values() {
        return values(Permissions.class);
    }
}
