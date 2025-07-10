package com.example.gardenplanner.model;


import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.model
 * File: PlantPlan.java
 * Author: Ochwada
 * Date: Wednesday, 09.Jul.2025, 3:58 PM
 * Description: Represents a plant care plan stored in the MongoDB collection "plantplans".
 * Objective:
 * *******************************************************
 */


/**
 * Lombok annotations:
 * - {@code @Data} generates getters, setters, toString, equals, and hashCode.
 * - {@code @NoArgsConstructor} creates a no-argument constructor.
 * - {@code @AllArgsConstructor} creates a constructor with all fields as parameters.
 * MongoDB:
 * - {@code @Document(collection = "plantplans")} indicates this class maps to the "plantplans" collection.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "plantplans")
public class PlantPlan {
    /** Unique identifier for the plant plan.*/
    @Id
    private String id;

    /** The name of the plant (e.g., "Tomato", "Rose"). */
    @NotBlank(message = "Name is required")
    private String name;

    /** Recommended planting season as an enum. ( MongoDB stores it as a string (e.g., "SPRING", "SUMMER")). */
    @NotNull(message = "Planting season is required") // used enum hence notnull
    private Season plantingSeason;

    /** Sunlight requirements (e.g., "Full Sun", "Partial Shade"). */
    @NotBlank(message = "Sunlight needs is required")
    private  String sunlightNeeds;

    /** Watering frequency (e.g., "Daily", "Twice a week").*/
    private String wateringFreq;

    /** Any additional notes or care instructions. */
    private String notes;


}
