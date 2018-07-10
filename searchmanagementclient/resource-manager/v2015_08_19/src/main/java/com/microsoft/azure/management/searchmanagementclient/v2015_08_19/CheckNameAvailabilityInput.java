/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_08_19;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input of check name availability API.
 */
public class CheckNameAvailabilityInput {
    /**
     * The Search service name to validate. Search service names must only
     * contain lowercase letters, digits or dashes, cannot use dash as the
     * first two or last one characters, cannot contain consecutive dashes, and
     * must be between 2 and 60 characters in length.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of the resource whose name is to be validated. This value must
     * always be 'searchServices'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of CheckNameAvailabilityInput class.
     * @param name the Search service name to validate. Search service names must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length.
     */
    public CheckNameAvailabilityInput() {
        type = "searchServices";
    }

    /**
     * Get the Search service name to validate. Search service names must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the Search service name to validate. Search service names must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the resource whose name is to be validated. This value must always be 'searchServices'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the resource whose name is to be validated. This value must always be 'searchServices'.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withType(String type) {
        this.type = type;
        return this;
    }

}
