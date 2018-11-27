/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.SecretResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes a secret resource.
 */
public class SecretResourceDescriptionInner {
    /**
     * Describes the properties of a secret resource.
     */
    @JsonProperty(value = "properties", required = true)
    private SecretResourceProperties properties;

    /**
     * Name of the Secret resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get describes the properties of a secret resource.
     *
     * @return the properties value
     */
    public SecretResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set describes the properties of a secret resource.
     *
     * @param properties the properties value to set
     * @return the SecretResourceDescriptionInner object itself.
     */
    public SecretResourceDescriptionInner withProperties(SecretResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get name of the Secret resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Secret resource.
     *
     * @param name the name value to set
     * @return the SecretResourceDescriptionInner object itself.
     */
    public SecretResourceDescriptionInner withName(String name) {
        this.name = name;
        return this;
    }

}
