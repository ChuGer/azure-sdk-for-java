/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.scheduler.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.scheduler.v2016_03_01.Jobs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobHistoryDefinition;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobDefinition;

class JobsImpl extends WrapperImpl<JobsInner> implements Jobs {
    private final SchedulerManager manager;

    JobsImpl(SchedulerManager manager) {
        super(manager.inner().jobs());
        this.manager = manager;
    }

    public SchedulerManager manager() {
        return this.manager;
    }

    @Override
    public JobDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    private JobDefinitionImpl wrapModel(JobDefinitionInner inner) {
        return  new JobDefinitionImpl(inner, manager());
    }

    private JobDefinitionImpl wrapModel(String name) {
        return new JobDefinitionImpl(name, this.manager());
    }

    @Override
    public Completable runAsync(String resourceGroupName, String jobCollectionName, String jobName) {
        JobsInner client = this.inner();
        return client.runAsync(resourceGroupName, jobCollectionName, jobName).toCompletable();
    }

    @Override
    public Observable<JobHistoryDefinition> listJobHistoryAsync(final String resourceGroupName, final String jobCollectionName, final String jobName) {
        JobsInner client = this.inner();
        return client.listJobHistoryAsync(resourceGroupName, jobCollectionName, jobName)
        .flatMapIterable(new Func1<Page<JobHistoryDefinitionInner>, Iterable<JobHistoryDefinitionInner>>() {
            @Override
            public Iterable<JobHistoryDefinitionInner> call(Page<JobHistoryDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobHistoryDefinitionInner, JobHistoryDefinition>() {
            @Override
            public JobHistoryDefinition call(JobHistoryDefinitionInner inner) {
                return new JobHistoryDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JobDefinition> listAsync(final String resourceGroupName, final String jobCollectionName) {
        JobsInner client = this.inner();
        return client.listAsync(resourceGroupName, jobCollectionName)
        .flatMapIterable(new Func1<Page<JobDefinitionInner>, Iterable<JobDefinitionInner>>() {
            @Override
            public Iterable<JobDefinitionInner> call(Page<JobDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobDefinitionInner, JobDefinition>() {
            @Override
            public JobDefinition call(JobDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<JobDefinition> getAsync(String resourceGroupName, String jobCollectionName, String jobName) {
        JobsInner client = this.inner();
        return client.getAsync(resourceGroupName, jobCollectionName, jobName)
        .map(new Func1<JobDefinitionInner, JobDefinition>() {
            @Override
            public JobDefinition call(JobDefinitionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String jobCollectionName, String jobName) {
        JobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, jobCollectionName, jobName).toCompletable();
    }

}
