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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The Get Historical Usage Metrics Web Site operation response.
*/
public class WebSiteGetHistoricalUsageMetricsResponse extends OperationResponse implements Iterable<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric> {
    private ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric> usageMetrics;
    
    /**
    * Optional. Historical metric snapshots for the web site.
    * @return The UsageMetrics value.
    */
    public ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric> getUsageMetrics() {
        return this.usageMetrics;
    }
    
    /**
    * Optional. Historical metric snapshots for the web site.
    * @param usageMetricsValue The UsageMetrics value.
    */
    public void setUsageMetrics(final ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric> usageMetricsValue) {
        this.usageMetrics = usageMetricsValue;
    }
    
    /**
    * Initializes a new instance of the
    * WebSiteGetHistoricalUsageMetricsResponse class.
    *
    */
    public WebSiteGetHistoricalUsageMetricsResponse() {
        super();
        this.setUsageMetrics(new ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric>());
    }
    
    /**
    * Gets the sequence of UsageMetrics.
    *
    */
    public Iterator<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetric> iterator() {
        return this.getUsageMetrics().iterator();
    }
    
    /**
    * Historical metric snapshot for the web site.
    */
    public static class HistoricalUsageMetric {
        private String code;
        
        /**
        * Optional. Reports whether the metric data was returned successfully.
        * @return The Code value.
        */
        public String getCode() {
            return this.code;
        }
        
        /**
        * Optional. Reports whether the metric data was returned successfully.
        * @param codeValue The Code value.
        */
        public void setCode(final String codeValue) {
            this.code = codeValue;
        }
        
        private WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricData data;
        
        /**
        * Optional. Historical metric snapshot data for the web site.
        * @return The Data value.
        */
        public WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricData getData() {
            return this.data;
        }
        
        /**
        * Optional. Historical metric snapshot data for the web site.
        * @param dataValue The Data value.
        */
        public void setData(final WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricData dataValue) {
            this.data = dataValue;
        }
        
        private String message;
        
        /**
        * Optional. A string for optional message content.
        * @return The Message value.
        */
        public String getMessage() {
            return this.message;
        }
        
        /**
        * Optional. A string for optional message content.
        * @param messageValue The Message value.
        */
        public void setMessage(final String messageValue) {
            this.message = messageValue;
        }
    }
    
    /**
    * Historical metric snapshot data for the web site.
    */
    public static class HistoricalUsageMetricData {
        private String displayName;
        
        /**
        * Optional. The display name of the metric, including spaces.
        * @return The DisplayName value.
        */
        public String getDisplayName() {
            return this.displayName;
        }
        
        /**
        * Optional. The display name of the metric, including spaces.
        * @param displayNameValue The DisplayName value.
        */
        public void setDisplayName(final String displayNameValue) {
            this.displayName = displayNameValue;
        }
        
        private Calendar endTime;
        
        /**
        * Optional. The end time of the data reported.
        * @return The EndTime value.
        */
        public Calendar getEndTime() {
            return this.endTime;
        }
        
        /**
        * Optional. The end time of the data reported.
        * @param endTimeValue The EndTime value.
        */
        public void setEndTime(final Calendar endTimeValue) {
            this.endTime = endTimeValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the metric.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the metric.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String primaryAggregationType;
        
        /**
        * Optional. The primary data aggregation type. This value is usually
        * Total.
        * @return The PrimaryAggregationType value.
        */
        public String getPrimaryAggregationType() {
            return this.primaryAggregationType;
        }
        
        /**
        * Optional. The primary data aggregation type. This value is usually
        * Total.
        * @param primaryAggregationTypeValue The PrimaryAggregationType value.
        */
        public void setPrimaryAggregationType(final String primaryAggregationTypeValue) {
            this.primaryAggregationType = primaryAggregationTypeValue;
        }
        
        private Calendar startTime;
        
        /**
        * Optional. The start time of the data reported.
        * @return The StartTime value.
        */
        public Calendar getStartTime() {
            return this.startTime;
        }
        
        /**
        * Optional. The start time of the data reported.
        * @param startTimeValue The StartTime value.
        */
        public void setStartTime(final Calendar startTimeValue) {
            this.startTime = startTimeValue;
        }
        
        private String timeGrain;
        
        /**
        * Optional. Length of time (rollup) during which the information was
        * gathered. For more information, see Supported Rollups.
        * @return The TimeGrain value.
        */
        public String getTimeGrain() {
            return this.timeGrain;
        }
        
        /**
        * Optional. Length of time (rollup) during which the information was
        * gathered. For more information, see Supported Rollups.
        * @param timeGrainValue The TimeGrain value.
        */
        public void setTimeGrain(final String timeGrainValue) {
            this.timeGrain = timeGrainValue;
        }
        
        private String unit;
        
        /**
        * Optional. The unit of measurement for the metric (for example,
        * milliseconds, bytes, or count).
        * @return The Unit value.
        */
        public String getUnit() {
            return this.unit;
        }
        
        /**
        * Optional. The unit of measurement for the metric (for example,
        * milliseconds, bytes, or count).
        * @param unitValue The Unit value.
        */
        public void setUnit(final String unitValue) {
            this.unit = unitValue;
        }
        
        private ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricSample> values;
        
        /**
        * Optional. One or more MetricSample elements.
        * @return The Values value.
        */
        public ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricSample> getValues() {
            return this.values;
        }
        
        /**
        * Optional. One or more MetricSample elements.
        * @param valuesValue The Values value.
        */
        public void setValues(final ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricSample> valuesValue) {
            this.values = valuesValue;
        }
        
        /**
        * Initializes a new instance of the HistoricalUsageMetricData class.
        *
        */
        public HistoricalUsageMetricData() {
            this.setValues(new ArrayList<WebSiteGetHistoricalUsageMetricsResponse.HistoricalUsageMetricSample>());
        }
    }
    
    /**
    * Historical metric snapshot data sample.
    */
    public static class HistoricalUsageMetricSample {
        private int count;
        
        /**
        * Optional. The metric sample count. This value is usually 1.
        * @return The Count value.
        */
        public int getCount() {
            return this.count;
        }
        
        /**
        * Optional. The metric sample count. This value is usually 1.
        * @param countValue The Count value.
        */
        public void setCount(final int countValue) {
            this.count = countValue;
        }
        
        private String maximum;
        
        /**
        * Optional. Maximum value recorded.
        * @return The Maximum value.
        */
        public String getMaximum() {
            return this.maximum;
        }
        
        /**
        * Optional. Maximum value recorded.
        * @param maximumValue The Maximum value.
        */
        public void setMaximum(final String maximumValue) {
            this.maximum = maximumValue;
        }
        
        private String minimum;
        
        /**
        * Optional. Minimum value recorded.
        * @return The Minimum value.
        */
        public String getMinimum() {
            return this.minimum;
        }
        
        /**
        * Optional. Minimum value recorded.
        * @param minimumValue The Minimum value.
        */
        public void setMinimum(final String minimumValue) {
            this.minimum = minimumValue;
        }
        
        private Calendar timeCreated;
        
        /**
        * Optional. Time the metric was taken.
        * @return The TimeCreated value.
        */
        public Calendar getTimeCreated() {
            return this.timeCreated;
        }
        
        /**
        * Optional. Time the metric was taken.
        * @param timeCreatedValue The TimeCreated value.
        */
        public void setTimeCreated(final Calendar timeCreatedValue) {
            this.timeCreated = timeCreatedValue;
        }
        
        private String total;
        
        /**
        * Optional. Value of the metric sample for the time taken.
        * @return The Total value.
        */
        public String getTotal() {
            return this.total;
        }
        
        /**
        * Optional. Value of the metric sample for the time taken.
        * @param totalValue The Total value.
        */
        public void setTotal(final String totalValue) {
            this.total = totalValue;
        }
    }
}
