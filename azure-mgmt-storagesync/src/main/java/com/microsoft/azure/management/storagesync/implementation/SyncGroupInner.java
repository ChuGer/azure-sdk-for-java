/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Sync Group object.
 */
@JsonFlatten
public class SyncGroupInner extends ProxyResource {
    /**
     * Unique Id.
     */
    @JsonProperty(value = "properties.uniqueId")
    private String uniqueId;

    /**
     * Sync group status.
     */
    @JsonProperty(value = "properties.syncGroupStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String syncGroupStatus;

    /**
     * Get unique Id.
     *
     * @return the uniqueId value
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Set unique Id.
     *
     * @param uniqueId the uniqueId value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * Get sync group status.
     *
     * @return the syncGroupStatus value
     */
    public String syncGroupStatus() {
        return this.syncGroupStatus;
    }

}
