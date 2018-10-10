/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServiceBusQueueMessage model.
 */
public class ServiceBusQueueMessage extends ServiceBusMessage {
    /**
     * Gets or sets the queue name.
     */
    @JsonProperty(value = "queueName")
    private String queueName;

    /**
     * Get gets or sets the queue name.
     *
     * @return the queueName value
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set gets or sets the queue name.
     *
     * @param queueName the queueName value to set
     * @return the ServiceBusQueueMessage object itself.
     */
    public ServiceBusQueueMessage withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

}
