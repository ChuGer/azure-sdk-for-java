/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription State object.
 */
public class SubscriptionState {
    /**
     * State of Azure Subscription. Possible values include: 'Registered',
     * 'Unregistered', 'Warned', 'Suspended', 'Deleted'.
     */
    @JsonProperty(value = "state")
    private Reason state;

    /**
     * Is Transitioning.
     */
    @JsonProperty(value = "istransitioning", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean istransitioning;

    /**
     * Subscription state properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get state of Azure Subscription. Possible values include: 'Registered', 'Unregistered', 'Warned', 'Suspended', 'Deleted'.
     *
     * @return the state value
     */
    public Reason state() {
        return this.state;
    }

    /**
     * Set state of Azure Subscription. Possible values include: 'Registered', 'Unregistered', 'Warned', 'Suspended', 'Deleted'.
     *
     * @param state the state value to set
     * @return the SubscriptionState object itself.
     */
    public SubscriptionState withState(Reason state) {
        this.state = state;
        return this;
    }

    /**
     * Get is Transitioning.
     *
     * @return the istransitioning value
     */
    public Boolean istransitioning() {
        return this.istransitioning;
    }

    /**
     * Get subscription state properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set subscription state properties.
     *
     * @param properties the properties value to set
     * @return the SubscriptionState object itself.
     */
    public SubscriptionState withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
