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

import com.microsoft.windowsazure.core.OperationStatus;
import java.util.Calendar;

/**
* Parameters supplied to the List Subscription Operations operation.
*/
public class SubscriptionListOperationsParameters {
    private String continuationToken;
    
    /**
    * Optional. When there are too many operations to list, such as when the
    * requested timeframe is very large, the response includes an incomplete
    * list and a token that can be used to return the rest of the list.
    * Subsequent requests must include this parameter to continue listing
    * operations from where the last response left off. If no token is
    * specified, a filter is not applied and the response will begin at the
    * specified StartTime.
    * @return The ContinuationToken value.
    */
    public String getContinuationToken() {
        return this.continuationToken;
    }
    
    /**
    * Optional. When there are too many operations to list, such as when the
    * requested timeframe is very large, the response includes an incomplete
    * list and a token that can be used to return the rest of the list.
    * Subsequent requests must include this parameter to continue listing
    * operations from where the last response left off. If no token is
    * specified, a filter is not applied and the response will begin at the
    * specified StartTime.
    * @param continuationTokenValue The ContinuationToken value.
    */
    public void setContinuationToken(final String continuationTokenValue) {
        this.continuationToken = continuationTokenValue;
    }
    
    private Calendar endTime;
    
    /**
    * Required. The end of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the StartTime parameter
    * indicate the timeframe to retrieve subscription operations.
    * @return The EndTime value.
    */
    public Calendar getEndTime() {
        return this.endTime;
    }
    
    /**
    * Required. The end of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the StartTime parameter
    * indicate the timeframe to retrieve subscription operations.
    * @param endTimeValue The EndTime value.
    */
    public void setEndTime(final Calendar endTimeValue) {
        this.endTime = endTimeValue;
    }
    
    private String objectIdFilter;
    
    /**
    * Optional. Returns subscription operations only for the specified object
    * type and object ID. This parameter must be set equal to the URL value
    * for performing an HTTP GET on the object. If no object is specified, a
    * filter is not applied.
    * @return The ObjectIdFilter value.
    */
    public String getObjectIdFilter() {
        return this.objectIdFilter;
    }
    
    /**
    * Optional. Returns subscription operations only for the specified object
    * type and object ID. This parameter must be set equal to the URL value
    * for performing an HTTP GET on the object. If no object is specified, a
    * filter is not applied.
    * @param objectIdFilterValue The ObjectIdFilter value.
    */
    public void setObjectIdFilter(final String objectIdFilterValue) {
        this.objectIdFilter = objectIdFilterValue;
    }
    
    private OperationStatus operationStatus;
    
    /**
    * Optional. Returns subscription operations only for the specified result
    * status, either Succeeded, Failed, or InProgress. This filter can be
    * combined with the ObjectIdFilter to select subscription operations for
    * an object with a specific result status. If no result status is
    * specified, a filter is not applied.
    * @return The OperationStatus value.
    */
    public OperationStatus getOperationStatus() {
        return this.operationStatus;
    }
    
    /**
    * Optional. Returns subscription operations only for the specified result
    * status, either Succeeded, Failed, or InProgress. This filter can be
    * combined with the ObjectIdFilter to select subscription operations for
    * an object with a specific result status. If no result status is
    * specified, a filter is not applied.
    * @param operationStatusValue The OperationStatus value.
    */
    public void setOperationStatus(final OperationStatus operationStatusValue) {
        this.operationStatus = operationStatusValue;
    }
    
    private Calendar startTime;
    
    /**
    * Required. The start of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the EndTime parameter
    * indicate the timeframe to retrieve subscription operations. This
    * parameter cannot indicate a start date of more than 90 days in the past.
    * @return The StartTime value.
    */
    public Calendar getStartTime() {
        return this.startTime;
    }
    
    /**
    * Required. The start of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the EndTime parameter
    * indicate the timeframe to retrieve subscription operations. This
    * parameter cannot indicate a start date of more than 90 days in the past.
    * @param startTimeValue The StartTime value.
    */
    public void setStartTime(final Calendar startTimeValue) {
        this.startTime = startTimeValue;
    }
    
    /**
    * Initializes a new instance of the SubscriptionListOperationsParameters
    * class.
    *
    */
    public SubscriptionListOperationsParameters() {
    }
    
    /**
    * Initializes a new instance of the SubscriptionListOperationsParameters
    * class with required arguments.
    *
    */
    public SubscriptionListOperationsParameters(Calendar startTime, Calendar endTime) {
        this.setStartTime(startTime);
        this.setEndTime(endTime);
    }
}
