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

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The set of connection details for a service bus entity.
*/
public class ServiceBusConnectionDetailsResponse extends OperationResponse implements Iterable<ServiceBusConnectionDetail> {
    private ArrayList<ServiceBusConnectionDetail> connectionDetails;
    
    /**
    * Optional. The set of connection details for a service bus entitiy.
    * @return The ConnectionDetails value.
    */
    public ArrayList<ServiceBusConnectionDetail> getConnectionDetails() {
        return this.connectionDetails;
    }
    
    /**
    * Optional. The set of connection details for a service bus entitiy.
    * @param connectionDetailsValue The ConnectionDetails value.
    */
    public void setConnectionDetails(final ArrayList<ServiceBusConnectionDetail> connectionDetailsValue) {
        this.connectionDetails = connectionDetailsValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusConnectionDetailsResponse
    * class.
    *
    */
    public ServiceBusConnectionDetailsResponse() {
        super();
        this.setConnectionDetails(new LazyArrayList<ServiceBusConnectionDetail>());
    }
    
    /**
    * Gets the sequence of ConnectionDetails.
    *
    */
    public Iterator<ServiceBusConnectionDetail> iterator() {
        return this.getConnectionDetails().iterator();
    }
}
