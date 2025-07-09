package com.example.gardenplanner.repository;


import com.example.gardenplanner.model.PlantPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.repository
 * File: PlantPlanRepository.java
 * Author: Ochwada
 * Date: Wednesday, 09.Jul.2025, 4:11 PM
 * Description:  Repository interface for the `PlantPlan` document.  Spring Data MongoDB automatically implements the
 *  *  interface at runtime, providing built-in CRUD methods
 * Objective:
 * *******************************************************
 */

/**
 * As long as we are extending MongoRepository, the @Repository annotation is optional.
 * Spring Data MongoDB will automatically detect this interface during component scanning and create a proxy bean at runtime.
 */

public interface PlantPlanRepository extends MongoRepository<PlantPlan, String> {
    // MongoRepository provides out-of-the-box CRUD methods like:
    // - findAll()
    // - findById(String id)
    // - insert(Product product)
    // - deleteById(String id)
    // - count()

}
