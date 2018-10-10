/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation.SchedulerManager;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation.JobCollectionDefinitionInner;

/**
 * Type representing JobCollectionDefinition.
 */
public interface JobCollectionDefinition extends HasInner<JobCollectionDefinitionInner>, Resource, GroupableResourceCore<SchedulerManager, JobCollectionDefinitionInner>, HasResourceGroup, Refreshable<JobCollectionDefinition>, Updatable<JobCollectionDefinition.Update>, HasManager<SchedulerManager> {
    /**
     * @return the properties value.
     */
    JobCollectionProperties properties();

    /**
     * The entirety of the JobCollectionDefinition definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of JobCollectionDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a JobCollectionDefinition definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the JobCollectionDefinition definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the jobcollectiondefinition definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Gets or sets the job collection properties
             * @return the next definition stage
             */
            WithCreate withProperties(JobCollectionProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<JobCollectionDefinition>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a JobCollectionDefinition update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<JobCollectionDefinition>, Resource.UpdateWithTags<Update>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of JobCollectionDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the jobcollectiondefinition update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Gets or sets the job collection properties
             * @return the next update stage
             */
            Update withProperties(JobCollectionProperties properties);
        }

    }
}
