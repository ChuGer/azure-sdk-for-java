/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AgentVMSizeTypes.
 */
public final class AgentVMSizeTypes extends ExpandableStringEnum<AgentVMSizeTypes> {
    /** Static value Standard_A0 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A0 = fromString("Standard_A0");

    /** Static value Standard_A1 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A1 = fromString("Standard_A1");

    /** Static value Standard_A2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A2 = fromString("Standard_A2");

    /** Static value Standard_A3 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A3 = fromString("Standard_A3");

    /** Static value Standard_A4 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A4 = fromString("Standard_A4");

    /** Static value Standard_A5 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A5 = fromString("Standard_A5");

    /** Static value Standard_A6 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A6 = fromString("Standard_A6");

    /** Static value Standard_A7 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A7 = fromString("Standard_A7");

    /** Static value Standard_A8 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A8 = fromString("Standard_A8");

    /** Static value Standard_A9 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A9 = fromString("Standard_A9");

    /** Static value Standard_A10 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A10 = fromString("Standard_A10");

    /** Static value Standard_A11 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_A11 = fromString("Standard_A11");

    /** Static value Standard_D1 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D1 = fromString("Standard_D1");

    /** Static value Standard_D2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D2 = fromString("Standard_D2");

    /** Static value Standard_D3 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D3 = fromString("Standard_D3");

    /** Static value Standard_D4 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D4 = fromString("Standard_D4");

    /** Static value Standard_D11 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D11 = fromString("Standard_D11");

    /** Static value Standard_D12 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D12 = fromString("Standard_D12");

    /** Static value Standard_D13 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D13 = fromString("Standard_D13");

    /** Static value Standard_D14 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D14 = fromString("Standard_D14");

    /** Static value Standard_D1_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D1_V2 = fromString("Standard_D1_v2");

    /** Static value Standard_D2_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D2_V2 = fromString("Standard_D2_v2");

    /** Static value Standard_D3_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D3_V2 = fromString("Standard_D3_v2");

    /** Static value Standard_D4_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D4_V2 = fromString("Standard_D4_v2");

    /** Static value Standard_D5_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D5_V2 = fromString("Standard_D5_v2");

    /** Static value Standard_D11_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D11_V2 = fromString("Standard_D11_v2");

    /** Static value Standard_D12_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D12_V2 = fromString("Standard_D12_v2");

    /** Static value Standard_D13_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D13_V2 = fromString("Standard_D13_v2");

    /** Static value Standard_D14_v2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_D14_V2 = fromString("Standard_D14_v2");

    /** Static value Standard_G1 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_G1 = fromString("Standard_G1");

    /** Static value Standard_G2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_G2 = fromString("Standard_G2");

    /** Static value Standard_G3 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_G3 = fromString("Standard_G3");

    /** Static value Standard_G4 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_G4 = fromString("Standard_G4");

    /** Static value Standard_G5 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_G5 = fromString("Standard_G5");

    /** Static value Standard_DS1 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS1 = fromString("Standard_DS1");

    /** Static value Standard_DS2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS2 = fromString("Standard_DS2");

    /** Static value Standard_DS3 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS3 = fromString("Standard_DS3");

    /** Static value Standard_DS4 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS4 = fromString("Standard_DS4");

    /** Static value Standard_DS11 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS11 = fromString("Standard_DS11");

    /** Static value Standard_DS12 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS12 = fromString("Standard_DS12");

    /** Static value Standard_DS13 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS13 = fromString("Standard_DS13");

    /** Static value Standard_DS14 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_DS14 = fromString("Standard_DS14");

    /** Static value Standard_GS1 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_GS1 = fromString("Standard_GS1");

    /** Static value Standard_GS2 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_GS2 = fromString("Standard_GS2");

    /** Static value Standard_GS3 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_GS3 = fromString("Standard_GS3");

    /** Static value Standard_GS4 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_GS4 = fromString("Standard_GS4");

    /** Static value Standard_GS5 for AgentVMSizeTypes. */
    public static final AgentVMSizeTypes STANDARD_GS5 = fromString("Standard_GS5");

    /**
     * Creates or finds a AgentVMSizeTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding AgentVMSizeTypes
     */
    @JsonCreator
    public static AgentVMSizeTypes fromString(String name) {
        return fromString(name, AgentVMSizeTypes.class);
    }

    /**
     * @return known AgentVMSizeTypes values
     */
    public static Collection<AgentVMSizeTypes> values() {
        return values(AgentVMSizeTypes.class);
    }
}
