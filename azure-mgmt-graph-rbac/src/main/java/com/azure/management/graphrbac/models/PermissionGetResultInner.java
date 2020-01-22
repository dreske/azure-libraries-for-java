// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PermissionGetResult model.
 */
@Fluent
public final class PermissionGetResultInner {
    /*
     * An array of permissions.
     */
    @JsonProperty(value = "value")
    private List<PermissionInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of permissions.
     * 
     * @return the value value.
     */
    public List<PermissionInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: An array of permissions.
     * 
     * @param value the value value to set.
     * @return the PermissionGetResultInner object itself.
     */
    public PermissionGetResultInner setValue(List<PermissionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of
     * results.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of
     * results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PermissionGetResultInner object itself.
     */
    public PermissionGetResultInner setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
