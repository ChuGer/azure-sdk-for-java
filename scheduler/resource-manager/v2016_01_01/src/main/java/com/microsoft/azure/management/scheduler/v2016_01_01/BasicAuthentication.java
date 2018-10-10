/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BasicAuthentication model.
 */
public class BasicAuthentication extends HttpAuthentication {
    /**
     * Gets or sets the username.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Gets or sets the password.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get gets or sets the username.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set gets or sets the username.
     *
     * @param username the username value to set
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get gets or sets the password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set gets or sets the password.
     *
     * @param password the password value to set
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withPassword(String password) {
        this.password = password;
        return this;
    }

}
