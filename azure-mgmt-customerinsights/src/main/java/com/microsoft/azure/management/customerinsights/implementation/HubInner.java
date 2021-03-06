/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights.implementation;

import com.microsoft.azure.management.customerinsights.HubBillingInfoFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Hub resource.
 */
@JsonFlatten
public class HubInner extends Resource {
    /**
     * API endpoint URL of the hub.
     */
    @JsonProperty(value = "properties.apiEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String apiEndpoint;

    /**
     * Web endpoint URL of the hub.
     */
    @JsonProperty(value = "properties.webEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String webEndpoint;

    /**
     * Provisioning state of the hub.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates
     * graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates
     * the hub is disabled, or enabled if set to 0.
     */
    @JsonProperty(value = "properties.tenantFeatures")
    private Integer tenantFeatures;

    /**
     * Billing settings of the hub.
     */
    @JsonProperty(value = "properties.hubBillingInfo")
    private HubBillingInfoFormat hubBillingInfo;

    /**
     * Get the apiEndpoint value.
     *
     * @return the apiEndpoint value
     */
    public String apiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * Get the webEndpoint value.
     *
     * @return the webEndpoint value
     */
    public String webEndpoint() {
        return this.webEndpoint;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the tenantFeatures value.
     *
     * @return the tenantFeatures value
     */
    public Integer tenantFeatures() {
        return this.tenantFeatures;
    }

    /**
     * Set the tenantFeatures value.
     *
     * @param tenantFeatures the tenantFeatures value to set
     * @return the HubInner object itself.
     */
    public HubInner withTenantFeatures(Integer tenantFeatures) {
        this.tenantFeatures = tenantFeatures;
        return this;
    }

    /**
     * Get the hubBillingInfo value.
     *
     * @return the hubBillingInfo value
     */
    public HubBillingInfoFormat hubBillingInfo() {
        return this.hubBillingInfo;
    }

    /**
     * Set the hubBillingInfo value.
     *
     * @param hubBillingInfo the hubBillingInfo value to set
     * @return the HubInner object itself.
     */
    public HubInner withHubBillingInfo(HubBillingInfoFormat hubBillingInfo) {
        this.hubBillingInfo = hubBillingInfo;
        return this;
    }

}
