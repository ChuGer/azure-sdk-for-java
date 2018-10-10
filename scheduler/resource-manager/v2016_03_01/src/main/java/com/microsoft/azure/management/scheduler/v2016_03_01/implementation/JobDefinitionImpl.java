/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01.implementation;

import com.microsoft.azure.management.scheduler.v2016_03_01.JobDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobProperties;
import org.joda.time.DateTime;
import rx.functions.Func1;

class JobDefinitionImpl extends CreatableUpdatableImpl<JobDefinition, JobDefinitionInner, JobDefinitionImpl> implements JobDefinition, JobDefinition.Definition, JobDefinition.Update {
    private final SchedulerManager manager;
    private String resourceGroupName;
    private String jobCollectionName;
    private String jobName;
    private JobProperties cproperties;
    private JobProperties uproperties;

    JobDefinitionImpl(String name, SchedulerManager manager) {
        super(name, new JobDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.jobName = name;
        //
        this.cproperties = new JobProperties();
        this.uproperties = new JobProperties();
    }

    JobDefinitionImpl(JobDefinitionInner inner, SchedulerManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.jobName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.jobCollectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobCollections");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobs");
        //
        this.cproperties = new JobProperties();
        this.uproperties = new JobProperties();
    }

    @Override
    public SchedulerManager manager() {
        return this.manager;
    }

    @Override
    public Observable<JobDefinition> createResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.jobCollectionName, this.jobName, this.cproperties)
            .map(new Func1<JobDefinitionInner, JobDefinitionInner>() {
               @Override
               public JobDefinitionInner call(JobDefinitionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<JobDefinition> updateResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.patchAsync(this.resourceGroupName, this.jobCollectionName, this.jobName, this.uproperties)
            .map(new Func1<JobDefinitionInner, JobDefinitionInner>() {
               @Override
               public JobDefinitionInner call(JobDefinitionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobDefinitionInner> getInnerAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.getAsync(this.resourceGroupName, this.jobCollectionName, this.jobName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new JobProperties();
        this.uproperties = new JobProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public JobProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public JobDefinitionImpl withExistingJobCollection(String resourceGroupName, String jobCollectionName) {
        this.resourceGroupName = resourceGroupName;
        this.jobCollectionName = jobCollectionName;
        return this;
    }

    @Override
    public JobDefinitionImpl withProperties(JobProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
