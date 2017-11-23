/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.implementation;

import java.util.Map;
import com.microsoft.azure.management.storage.Identity;
import com.microsoft.azure.management.storage.CustomDomain;
import com.microsoft.azure.management.storage.Encryption;
import com.microsoft.azure.management.storage.AccessTier;
import com.microsoft.azure.management.storage.NetworkRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters that can be provided when updating the storage account
 * properties.
 */
@JsonFlatten
public class StorageAccountUpdateParametersInner {
    /**
     * Gets or sets the SKU name. Note that the SKU name cannot be updated to
     * Standard_ZRS or Premium_LRS, nor can accounts of those sku names be
     * updated to any other value.
     */
    @JsonProperty(value = "sku")
    private SkuInner sku;

    /**
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater in length than 128 characters and a value no
     * greater in length than 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Custom domain assigned to the storage account by the user. Name is the
     * CNAME source. Only one custom domain is supported per storage account at
     * this time. To clear the existing custom domain, use an empty string for
     * the custom domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /**
     * Provides the encryption settings on the account. The default setting is
     * unencrypted.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing. Possible values include: 'Hot', 'Cool'.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /**
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /**
     * Network rule set.
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkRuleSet;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withSku(SkuInner sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the customDomain value.
     *
     * @return the customDomain value
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain value.
     *
     * @param customDomain the customDomain value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption value.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption value.
     *
     * @param encryption the encryption value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the accessTier value.
     *
     * @return the accessTier value
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier value.
     *
     * @param accessTier the accessTier value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly value.
     *
     * @return the enableHttpsTrafficOnly value
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly value.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get the networkRuleSet value.
     *
     * @return the networkRuleSet value
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet value.
     *
     * @param networkRuleSet the networkRuleSet value to set
     * @return the StorageAccountUpdateParametersInner object itself.
     */
    public StorageAccountUpdateParametersInner withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

}
