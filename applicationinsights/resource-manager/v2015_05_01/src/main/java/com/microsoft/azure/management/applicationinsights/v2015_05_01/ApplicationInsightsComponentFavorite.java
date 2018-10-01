/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentFavoriteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;
import java.util.List;

/**
 * Type representing ApplicationInsightsComponentFavorite.
 */
public interface ApplicationInsightsComponentFavorite extends HasInner<ApplicationInsightsComponentFavoriteInner>, Indexable, HasManager<InsightsManager> {
    /**
     * @return the category value.
     */
    String category();

    /**
     * @return the config value.
     */
    String config();

    /**
     * @return the favoriteId value.
     */
    String favoriteId();

    /**
     * @return the favoriteType value.
     */
    FavoriteType favoriteType();

    /**
     * @return the isGeneratedFromTemplate value.
     */
    Boolean isGeneratedFromTemplate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sourceType value.
     */
    String sourceType();

    /**
     * @return the tags value.
     */
    List<String> tags();

    /**
     * @return the timeModified value.
     */
    String timeModified();

    /**
     * @return the userId value.
     */
    String userId();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the ApplicationInsightsComponentFavorite definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithComponent, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ApplicationInsightsComponentFavorite definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ApplicationInsightsComponentFavorite definition.
         */
        interface Blank extends WithComponent {
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Component.
         */
        interface WithComponent {
           /**
            * Specifies resourceGroupName, resourceName.
            * @param resourceGroupName The name of the resource group
            * @param resourceName The name of the Application Insights component resource
            * @return the next definition stage
            */
            WithCreate withExistingComponent(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Category.
         */
        interface WithCategory {
            /**
             * Specifies category.
             * @param category Favorite category, as defined by the user at creation time
             * @return the next definition stage
             */
            WithCreate withCategory(String category);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Config.
         */
        interface WithConfig {
            /**
             * Specifies config.
             * @param config Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
             * @return the next definition stage
             */
            WithCreate withConfig(String config);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify FavoriteType.
         */
        interface WithFavoriteType {
            /**
             * Specifies favoriteType.
             * @param favoriteType Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component. Possible values include: 'shared', 'user'
             * @return the next definition stage
             */
            WithCreate withFavoriteType(FavoriteType favoriteType);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify IsGeneratedFromTemplate.
         */
        interface WithIsGeneratedFromTemplate {
            /**
             * Specifies isGeneratedFromTemplate.
             * @param isGeneratedFromTemplate Flag denoting wether or not this favorite was generated from a template
             * @return the next definition stage
             */
            WithCreate withIsGeneratedFromTemplate(Boolean isGeneratedFromTemplate);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The user-defined name of the favorite
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify SourceType.
         */
        interface WithSourceType {
            /**
             * Specifies sourceType.
             * @param sourceType The source of the favorite definition
             * @return the next definition stage
             */
            WithCreate withSourceType(String sourceType);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags A list of 0 or more tags that are associated with this favorite definition
             * @return the next definition stage
             */
            WithCreate withTags(List<String> tags);
        }

        /**
         * The stage of the applicationinsightscomponentfavorite definition allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             * @param version This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search
             * @return the next definition stage
             */
            WithCreate withVersion(String version);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ApplicationInsightsComponentFavorite>, DefinitionStages.WithCategory, DefinitionStages.WithConfig, DefinitionStages.WithFavoriteType, DefinitionStages.WithIsGeneratedFromTemplate, DefinitionStages.WithName, DefinitionStages.WithSourceType, DefinitionStages.WithTags, DefinitionStages.WithVersion {
        }
    }
}
