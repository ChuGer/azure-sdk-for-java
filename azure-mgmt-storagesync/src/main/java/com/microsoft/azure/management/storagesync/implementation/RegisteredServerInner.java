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
 * Registered Server resource.
 */
@JsonFlatten
public class RegisteredServerInner extends ProxyResource {
    /**
     * Registered Server Certificate.
     */
    @JsonProperty(value = "properties.serverCertificate")
    private String serverCertificate;

    /**
     * Registered Server Agent Version.
     */
    @JsonProperty(value = "properties.agentVersion")
    private String agentVersion;

    /**
     * Registered Server OS Version.
     */
    @JsonProperty(value = "properties.serverOSVersion")
    private String serverOSVersion;

    /**
     * Registered Server Management Error Code.
     */
    @JsonProperty(value = "properties.serverManagementtErrorCode")
    private Integer serverManagementtErrorCode;

    /**
     * Registered Server last heart beat.
     */
    @JsonProperty(value = "properties.lastHeartBeat")
    private String lastHeartBeat;

    /**
     * Registered Server Provisioning State.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Registered Server serverRole.
     */
    @JsonProperty(value = "properties.serverRole")
    private String serverRole;

    /**
     * Registered Server clusterId.
     */
    @JsonProperty(value = "properties.clusterId")
    private String clusterId;

    /**
     * Registered Server clusterName.
     */
    @JsonProperty(value = "properties.clusterName")
    private String clusterName;

    /**
     * Registered Server serverId.
     */
    @JsonProperty(value = "properties.serverId")
    private String serverId;

    /**
     * Registered Server storageSyncServiceUid.
     */
    @JsonProperty(value = "properties.storageSyncServiceUid")
    private String storageSyncServiceUid;

    /**
     * Registered Server lastWorkflowId.
     */
    @JsonProperty(value = "properties.lastWorkflowId")
    private String lastWorkflowId;

    /**
     * Resource Last Operation Name.
     */
    @JsonProperty(value = "properties.lastOperationName")
    private String lastOperationName;

    /**
     * Resource discoveryEndpointUri.
     */
    @JsonProperty(value = "properties.discoveryEndpointUri")
    private String discoveryEndpointUri;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "properties.resourceLocation")
    private String resourceLocation;

    /**
     * Service Location.
     */
    @JsonProperty(value = "properties.serviceLocation")
    private String serviceLocation;

    /**
     * Friendly Name.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Management Endpoint Uri.
     */
    @JsonProperty(value = "properties.managementEndpointUri")
    private String managementEndpointUri;

    /**
     * Get registered Server Certificate.
     *
     * @return the serverCertificate value
     */
    public String serverCertificate() {
        return this.serverCertificate;
    }

    /**
     * Set registered Server Certificate.
     *
     * @param serverCertificate the serverCertificate value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    /**
     * Get registered Server Agent Version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set registered Server Agent Version.
     *
     * @param agentVersion the agentVersion value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get registered Server OS Version.
     *
     * @return the serverOSVersion value
     */
    public String serverOSVersion() {
        return this.serverOSVersion;
    }

    /**
     * Set registered Server OS Version.
     *
     * @param serverOSVersion the serverOSVersion value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerOSVersion(String serverOSVersion) {
        this.serverOSVersion = serverOSVersion;
        return this;
    }

    /**
     * Get registered Server Management Error Code.
     *
     * @return the serverManagementtErrorCode value
     */
    public Integer serverManagementtErrorCode() {
        return this.serverManagementtErrorCode;
    }

    /**
     * Set registered Server Management Error Code.
     *
     * @param serverManagementtErrorCode the serverManagementtErrorCode value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerManagementtErrorCode(Integer serverManagementtErrorCode) {
        this.serverManagementtErrorCode = serverManagementtErrorCode;
        return this;
    }

    /**
     * Get registered Server last heart beat.
     *
     * @return the lastHeartBeat value
     */
    public String lastHeartBeat() {
        return this.lastHeartBeat;
    }

    /**
     * Set registered Server last heart beat.
     *
     * @param lastHeartBeat the lastHeartBeat value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastHeartBeat(String lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }

    /**
     * Get registered Server Provisioning State.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set registered Server Provisioning State.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get registered Server serverRole.
     *
     * @return the serverRole value
     */
    public String serverRole() {
        return this.serverRole;
    }

    /**
     * Set registered Server serverRole.
     *
     * @param serverRole the serverRole value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerRole(String serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Get registered Server clusterId.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set registered Server clusterId.
     *
     * @param clusterId the clusterId value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get registered Server clusterName.
     *
     * @return the clusterName value
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Set registered Server clusterName.
     *
     * @param clusterName the clusterName value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get registered Server serverId.
     *
     * @return the serverId value
     */
    public String serverId() {
        return this.serverId;
    }

    /**
     * Set registered Server serverId.
     *
     * @param serverId the serverId value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get registered Server storageSyncServiceUid.
     *
     * @return the storageSyncServiceUid value
     */
    public String storageSyncServiceUid() {
        return this.storageSyncServiceUid;
    }

    /**
     * Set registered Server storageSyncServiceUid.
     *
     * @param storageSyncServiceUid the storageSyncServiceUid value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withStorageSyncServiceUid(String storageSyncServiceUid) {
        this.storageSyncServiceUid = storageSyncServiceUid;
        return this;
    }

    /**
     * Get registered Server lastWorkflowId.
     *
     * @return the lastWorkflowId value
     */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
    }

    /**
     * Set registered Server lastWorkflowId.
     *
     * @param lastWorkflowId the lastWorkflowId value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastWorkflowId(String lastWorkflowId) {
        this.lastWorkflowId = lastWorkflowId;
        return this;
    }

    /**
     * Get resource Last Operation Name.
     *
     * @return the lastOperationName value
     */
    public String lastOperationName() {
        return this.lastOperationName;
    }

    /**
     * Set resource Last Operation Name.
     *
     * @param lastOperationName the lastOperationName value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastOperationName(String lastOperationName) {
        this.lastOperationName = lastOperationName;
        return this;
    }

    /**
     * Get resource discoveryEndpointUri.
     *
     * @return the discoveryEndpointUri value
     */
    public String discoveryEndpointUri() {
        return this.discoveryEndpointUri;
    }

    /**
     * Set resource discoveryEndpointUri.
     *
     * @param discoveryEndpointUri the discoveryEndpointUri value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withDiscoveryEndpointUri(String discoveryEndpointUri) {
        this.discoveryEndpointUri = discoveryEndpointUri;
        return this;
    }

    /**
     * Get resource Location.
     *
     * @return the resourceLocation value
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set resource Location.
     *
     * @param resourceLocation the resourceLocation value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get service Location.
     *
     * @return the serviceLocation value
     */
    public String serviceLocation() {
        return this.serviceLocation;
    }

    /**
     * Set service Location.
     *
     * @param serviceLocation the serviceLocation value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }

    /**
     * Get friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get management Endpoint Uri.
     *
     * @return the managementEndpointUri value
     */
    public String managementEndpointUri() {
        return this.managementEndpointUri;
    }

    /**
     * Set management Endpoint Uri.
     *
     * @param managementEndpointUri the managementEndpointUri value to set
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withManagementEndpointUri(String managementEndpointUri) {
        this.managementEndpointUri = managementEndpointUri;
        return this;
    }

}
