/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Sku model.
 */
public class Sku {
    /**
     * Gets or set the SKU. Possible values include: 'Standard', 'Free',
     * 'Premium'.
     */
    @JsonProperty(value = "name")
    private SkuDefinition name;

    /**
     * Get gets or set the SKU. Possible values include: 'Standard', 'Free', 'Premium'.
     *
     * @return the name value
     */
    public SkuDefinition name() {
        return this.name;
    }

    /**
     * Set gets or set the SKU. Possible values include: 'Standard', 'Free', 'Premium'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuDefinition name) {
        this.name = name;
        return this;
    }

}
