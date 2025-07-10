package com.example.gardenplanner.model;


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.model
 * File: Season.java
 * Author: Ochwada
 * Date: Wednesday, 09.Jul.2025, 4:05 PM
 * Description: Represents the seasons of the year relevant for planting.
 * - This enum can be used to specify the planting season for a {@link PlantPlan}.
 * Objective:
 * *******************************************************
 */


public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    /**
     * Factory method to enable case-insensitive deserialization of enum values.
     * *
     * This method is automatically used by Jackson when deserializing JSON
     * due to the @JsonCreator annotation.
     *
     * @param input the season string from JSON (e.g., "summer", "WINTER")
     * @return the corresponding Season enum constant
     * @throws IllegalArgumentException if input does not match any Season
     */
    @JsonCreator
    public static Season fromString(String input) {
        return Season.valueOf(input.trim().toUpperCase());
    }
}
