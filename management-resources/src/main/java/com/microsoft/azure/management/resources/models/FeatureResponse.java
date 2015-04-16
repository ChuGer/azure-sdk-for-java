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

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* Previewed feature information.
*/
public class FeatureResponse extends OperationResponse {
    private String id;
    
    /**
    * Optional. Gets or sets the Id of the feature.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets or sets the Id of the feature.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the name of the feature.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the name of the feature.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private FeatureProperties properties;
    
    /**
    * Optional. Gets or sets the properties of the previewed feature.
    * @return The Properties value.
    */
    public FeatureProperties getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Gets or sets the properties of the previewed feature.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final FeatureProperties propertiesValue) {
        this.properties = propertiesValue;
    }
    
    private String type;
    
    /**
    * Optional. Gets or sets the type of the feature.
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. Gets or sets the type of the feature.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
}
