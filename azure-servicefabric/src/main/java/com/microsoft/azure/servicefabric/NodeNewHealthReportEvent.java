/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Health Report Created event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeNewHealthReport")
public class NodeNewHealthReportEvent extends NodeEventInner {
    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private long nodeInstanceId;

    /**
     * Id of report source.
     */
    @JsonProperty(value = "SourceId", required = true)
    private String sourceId;

    /**
     * Describes the property.
     */
    @JsonProperty(value = "Property", required = true)
    private String property;

    /**
     * Describes the property health state.
     */
    @JsonProperty(value = "HealthState", required = true)
    private String healthState;

    /**
     * Time to live in milli-seconds.
     */
    @JsonProperty(value = "TimeToLiveMs", required = true)
    private long timeToLiveMs;

    /**
     * Sequence number of report.
     */
    @JsonProperty(value = "SequenceNumber", required = true)
    private long sequenceNumber;

    /**
     * Description of report.
     */
    @JsonProperty(value = "Description", required = true)
    private String description;

    /**
     * Indicates the removal when it expires.
     */
    @JsonProperty(value = "RemoveWhenExpired", required = true)
    private boolean removeWhenExpired;

    /**
     * Source time.
     */
    @JsonProperty(value = "SourceUtcTimestamp", required = true)
    private DateTime sourceUtcTimestamp;

    /**
     * Get id of Node instance.
     *
     * @return the nodeInstanceId value
     */
    public long nodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set id of Node instance.
     *
     * @param nodeInstanceId the nodeInstanceId value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withNodeInstanceId(long nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * Get id of report source.
     *
     * @return the sourceId value
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set id of report source.
     *
     * @param sourceId the sourceId value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get describes the property.
     *
     * @return the property value
     */
    public String property() {
        return this.property;
    }

    /**
     * Set describes the property.
     *
     * @param property the property value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get describes the property health state.
     *
     * @return the healthState value
     */
    public String healthState() {
        return this.healthState;
    }

    /**
     * Set describes the property health state.
     *
     * @param healthState the healthState value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withHealthState(String healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get time to live in milli-seconds.
     *
     * @return the timeToLiveMs value
     */
    public long timeToLiveMs() {
        return this.timeToLiveMs;
    }

    /**
     * Set time to live in milli-seconds.
     *
     * @param timeToLiveMs the timeToLiveMs value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withTimeToLiveMs(long timeToLiveMs) {
        this.timeToLiveMs = timeToLiveMs;
        return this;
    }

    /**
     * Get sequence number of report.
     *
     * @return the sequenceNumber value
     */
    public long sequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set sequence number of report.
     *
     * @param sequenceNumber the sequenceNumber value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Get description of report.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of report.
     *
     * @param description the description value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get indicates the removal when it expires.
     *
     * @return the removeWhenExpired value
     */
    public boolean removeWhenExpired() {
        return this.removeWhenExpired;
    }

    /**
     * Set indicates the removal when it expires.
     *
     * @param removeWhenExpired the removeWhenExpired value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withRemoveWhenExpired(boolean removeWhenExpired) {
        this.removeWhenExpired = removeWhenExpired;
        return this;
    }

    /**
     * Get source time.
     *
     * @return the sourceUtcTimestamp value
     */
    public DateTime sourceUtcTimestamp() {
        return this.sourceUtcTimestamp;
    }

    /**
     * Set source time.
     *
     * @param sourceUtcTimestamp the sourceUtcTimestamp value to set
     * @return the NodeNewHealthReportEvent object itself.
     */
    public NodeNewHealthReportEvent withSourceUtcTimestamp(DateTime sourceUtcTimestamp) {
        this.sourceUtcTimestamp = sourceUtcTimestamp;
        return this;
    }

}
