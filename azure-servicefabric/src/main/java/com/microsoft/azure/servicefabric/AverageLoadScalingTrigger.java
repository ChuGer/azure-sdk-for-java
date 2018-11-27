/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the average load trigger used for auto scaling.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AverageLoad")
public class AverageLoadScalingTrigger extends AutoScalingTrigger {
    /**
     * Description of the metric that is used for scaling.
     */
    @JsonProperty(value = "metric", required = true)
    private AutoScalingMetric metric;

    /**
     * Lower load threshold (if average load is below this threshold, service
     * will scale down).
     */
    @JsonProperty(value = "lowerLoadThreshold", required = true)
    private double lowerLoadThreshold;

    /**
     * Upper load threshold (if average load is above this threshold, service
     * will scale up).
     */
    @JsonProperty(value = "upperLoadThreshold", required = true)
    private double upperLoadThreshold;

    /**
     * Scale interval that indicates how often will this trigger be checked.
     */
    @JsonProperty(value = "scaleIntervalInSeconds", required = true)
    private int scaleIntervalInSeconds;

    /**
     * Get description of the metric that is used for scaling.
     *
     * @return the metric value
     */
    public AutoScalingMetric metric() {
        return this.metric;
    }

    /**
     * Set description of the metric that is used for scaling.
     *
     * @param metric the metric value to set
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger withMetric(AutoScalingMetric metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get lower load threshold (if average load is below this threshold, service will scale down).
     *
     * @return the lowerLoadThreshold value
     */
    public double lowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Set lower load threshold (if average load is below this threshold, service will scale down).
     *
     * @param lowerLoadThreshold the lowerLoadThreshold value to set
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger withLowerLoadThreshold(double lowerLoadThreshold) {
        this.lowerLoadThreshold = lowerLoadThreshold;
        return this;
    }

    /**
     * Get upper load threshold (if average load is above this threshold, service will scale up).
     *
     * @return the upperLoadThreshold value
     */
    public double upperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    /**
     * Set upper load threshold (if average load is above this threshold, service will scale up).
     *
     * @param upperLoadThreshold the upperLoadThreshold value to set
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger withUpperLoadThreshold(double upperLoadThreshold) {
        this.upperLoadThreshold = upperLoadThreshold;
        return this;
    }

    /**
     * Get scale interval that indicates how often will this trigger be checked.
     *
     * @return the scaleIntervalInSeconds value
     */
    public int scaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Set scale interval that indicates how often will this trigger be checked.
     *
     * @param scaleIntervalInSeconds the scaleIntervalInSeconds value to set
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger withScaleIntervalInSeconds(int scaleIntervalInSeconds) {
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        return this;
    }

}
