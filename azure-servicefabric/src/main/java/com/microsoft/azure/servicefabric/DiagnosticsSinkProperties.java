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
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Properties of a DiagnosticsSink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("DiagnosticsSinkProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureInternalMonitoringPipeline", value = AzureInternalMonitoringPipelineSinkDescription.class)
})
public class DiagnosticsSinkProperties {
    /**
     * Name of the sink. This value is referenced by
     * DiagnosticsReferenceDescription.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A description of the sink.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get name of the sink. This value is referenced by DiagnosticsReferenceDescription.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the sink. This value is referenced by DiagnosticsReferenceDescription.
     *
     * @param name the name value to set
     * @return the DiagnosticsSinkProperties object itself.
     */
    public DiagnosticsSinkProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a description of the sink.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set a description of the sink.
     *
     * @param description the description value to set
     * @return the DiagnosticsSinkProperties object itself.
     */
    public DiagnosticsSinkProperties withDescription(String description) {
        this.description = description;
        return this;
    }

}
