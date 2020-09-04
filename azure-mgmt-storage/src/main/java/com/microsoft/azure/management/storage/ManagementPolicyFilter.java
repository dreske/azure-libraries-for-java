/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters limit rule actions to a subset of blobs within the storage account.
 * If multiple filters are defined, a logical AND is performed on all filters.
 */
public class ManagementPolicyFilter {
    /**
     * An array of strings for prefixes to be match.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /**
     * An array of predefined enum values. Only blockBlob is supported.
     */
    @JsonProperty(value = "blobTypes", required = true)
    private List<String> blobTypes;

    /**
     * An array of blob index tag based filters, there can be at most 10 tag
     * filters.
     */
    @JsonProperty(value = "blobIndexMatch")
    private List<TagFilter> blobIndexMatch;

    /**
     * Get an array of strings for prefixes to be match.
     *
     * @return the prefixMatch value
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set an array of strings for prefixes to be match.
     *
     * @param prefixMatch the prefixMatch value to set
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get an array of predefined enum values. Only blockBlob is supported.
     *
     * @return the blobTypes value
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Set an array of predefined enum values. Only blockBlob is supported.
     *
     * @param blobTypes the blobTypes value to set
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get an array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @return the blobIndexMatch value
     */
    public List<TagFilter> blobIndexMatch() {
        return this.blobIndexMatch;
    }

    /**
     * Set an array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @param blobIndexMatch the blobIndexMatch value to set
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withBlobIndexMatch(List<TagFilter> blobIndexMatch) {
        this.blobIndexMatch = blobIndexMatch;
        return this;
    }

}
