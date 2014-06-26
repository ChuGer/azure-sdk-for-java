/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.util.ArrayList;

/**
* Parameters for the shutdown roles operation.
*/
public class VirtualMachineShutdownRolesParameters {
    private PostShutdownAction postShutdownAction;
    
    /**
    * Optional. The state of the roles after shutdown. Possible values include
    * Stopped or StoppedDeallocated.
    * @return The PostShutdownAction value.
    */
    public PostShutdownAction getPostShutdownAction() {
        return this.postShutdownAction;
    }
    
    /**
    * Optional. The state of the roles after shutdown. Possible values include
    * Stopped or StoppedDeallocated.
    * @param postShutdownActionValue The PostShutdownAction value.
    */
    public void setPostShutdownAction(final PostShutdownAction postShutdownActionValue) {
        this.postShutdownAction = postShutdownActionValue;
    }
    
    private ArrayList<String> roles;
    
    /**
    * Optional. The set of roles to shut down.
    * @return The Roles value.
    */
    public ArrayList<String> getRoles() {
        return this.roles;
    }
    
    /**
    * Optional. The set of roles to shut down.
    * @param rolesValue The Roles value.
    */
    public void setRoles(final ArrayList<String> rolesValue) {
        this.roles = rolesValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineShutdownRolesParameters
    * class.
    *
    */
    public VirtualMachineShutdownRolesParameters() {
        this.setRoles(new ArrayList<String>());
    }
}
