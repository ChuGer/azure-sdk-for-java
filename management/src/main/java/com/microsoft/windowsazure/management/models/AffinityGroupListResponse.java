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

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The List Affinity Groups operation response.
*/
public class AffinityGroupListResponse extends OperationResponse implements Iterable<AffinityGroupListResponse.AffinityGroup> {
    private ArrayList<AffinityGroupListResponse.AffinityGroup> affinityGroups;
    
    /**
    * Optional. The affinity groups associated with the specified subscription.
    * @return The AffinityGroups value.
    */
    public ArrayList<AffinityGroupListResponse.AffinityGroup> getAffinityGroups() {
        return this.affinityGroups;
    }
    
    /**
    * Optional. The affinity groups associated with the specified subscription.
    * @param affinityGroupsValue The AffinityGroups value.
    */
    public void setAffinityGroups(final ArrayList<AffinityGroupListResponse.AffinityGroup> affinityGroupsValue) {
        this.affinityGroups = affinityGroupsValue;
    }
    
    /**
    * Initializes a new instance of the AffinityGroupListResponse class.
    *
    */
    public AffinityGroupListResponse() {
        super();
        this.setAffinityGroups(new ArrayList<AffinityGroupListResponse.AffinityGroup>());
    }
    
    /**
    * Gets the sequence of AffinityGroups.
    *
    */
    public Iterator<AffinityGroupListResponse.AffinityGroup> iterator() {
        return this.getAffinityGroups().iterator();
    }
    
    /**
    * An affinity group associated with the specified subscription.
    */
    public static class AffinityGroup {
        private ArrayList<String> capabilities;
        
        /**
        * Optional. Indicates if the affinity group is able to perform virtual
        * machine-related operations. If so, the string PersistentVMRole will
        * be returned by this element. Otherwise, this element will not be
        * present.
        * @return The Capabilities value.
        */
        public ArrayList<String> getCapabilities() {
            return this.capabilities;
        }
        
        /**
        * Optional. Indicates if the affinity group is able to perform virtual
        * machine-related operations. If so, the string PersistentVMRole will
        * be returned by this element. Otherwise, this element will not be
        * present.
        * @param capabilitiesValue The Capabilities value.
        */
        public void setCapabilities(final ArrayList<String> capabilitiesValue) {
            this.capabilities = capabilitiesValue;
        }
        
        private ComputeCapabilities computeCapabilities;
        
        /**
        * Optional. The compute capabilities in this affinity group.
        * @return The ComputeCapabilities value.
        */
        public ComputeCapabilities getComputeCapabilities() {
            return this.computeCapabilities;
        }
        
        /**
        * Optional. The compute capabilities in this affinity group.
        * @param computeCapabilitiesValue The ComputeCapabilities value.
        */
        public void setComputeCapabilities(final ComputeCapabilities computeCapabilitiesValue) {
            this.computeCapabilities = computeCapabilitiesValue;
        }
        
        private Calendar createdTime;
        
        /**
        * Optional. The time that the affinity group was created.
        * @return The CreatedTime value.
        */
        public Calendar getCreatedTime() {
            return this.createdTime;
        }
        
        /**
        * Optional. The time that the affinity group was created.
        * @param createdTimeValue The CreatedTime value.
        */
        public void setCreatedTime(final Calendar createdTimeValue) {
            this.createdTime = createdTimeValue;
        }
        
        private String description;
        
        /**
        * Optional. The user-supplied description for this affinity group.
        * @return The Description value.
        */
        public String getDescription() {
            return this.description;
        }
        
        /**
        * Optional. The user-supplied description for this affinity group.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue) {
            this.description = descriptionValue;
        }
        
        private String label;
        
        /**
        * Optional. The user-supplied label for the affinity group, returned as
        * a base-64-encoded string.
        * @return The Label value.
        */
        public String getLabel() {
            return this.label;
        }
        
        /**
        * Optional. The user-supplied label for the affinity group, returned as
        * a base-64-encoded string.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue) {
            this.label = labelValue;
        }
        
        private String location;
        
        /**
        * Optional. The user-specified data center that this affinity groups is
        * located in.
        * @return The Location value.
        */
        public String getLocation() {
            return this.location;
        }
        
        /**
        * Optional. The user-specified data center that this affinity groups is
        * located in.
        * @param locationValue The Location value.
        */
        public void setLocation(final String locationValue) {
            this.location = locationValue;
        }
        
        private String name;
        
        /**
        * Optional. The user-supplied name for the affinity group.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The user-supplied name for the affinity group.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        /**
        * Initializes a new instance of the AffinityGroup class.
        *
        */
        public AffinityGroup() {
            this.setCapabilities(new ArrayList<String>());
        }
    }
}
