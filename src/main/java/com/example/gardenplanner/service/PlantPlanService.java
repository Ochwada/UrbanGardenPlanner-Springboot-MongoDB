package com.example.gardenplanner.service;


import com.example.gardenplanner.model.PlantPlan;
import com.example.gardenplanner.repository.PlantPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.service
 * File: PlantPlanService.java
 * Author: Ochwada
 * Date: Wednesday, 09.Jul.2025, 4:13 PM
 * Description: Service layer for PlantPlan operations.
 * - Service class for handling business logic related to products.
 * Objective:
 * *******************************************************
 */

@Service
public class PlantPlanService {

    // Dependency on the repository layer to perform CRUD operations on PlantPlan documents
    private final PlantPlanRepository plantPlanRepository;

    /**
     * Constructor-based dependency injection  using @Autowired. (constructor injection of repository)
     * Spring injects ('introduces') an instance of PlantPlanRepository at runtime.
     *
     * @param plantPlanRepository The repository used to access Product data from MongoDB
     */
    @Autowired
    public PlantPlanService(PlantPlanRepository plantPlanRepository) {
        this.plantPlanRepository = plantPlanRepository;
    }

    /**
     * ---------------------------------------------------------------------------
     * Business methods like
     * - addProduct(), getAllProducts(), getProductById() etc. go here.
     * ---------------------------------------------------------------------------
     */

    /**
     * Adds new plan to the database
     *
     * @param plan The PlantPlan object is added.
     * @return The inserted PlantPlan document, including the generated '_id'
     */
    public PlantPlan addPlantPlans(PlantPlan plan) {
        return plantPlanRepository.insert(plan);
    }

    /**
     * Retrieve all PlantPlans from teh MongoDB database
     *
     * @return a List of all PlantPlans objects stored in the database.
     */
    public List<PlantPlan> getAllPlantPlans() {
        return plantPlanRepository.findAll();
    }

    /**
     * Retrieve a single PlatPlan by its unique identifier
     *
     * @return An {@link Optional} containing the PlantPlan if found, or empty if not found.
     */
    public Optional<PlantPlan> getPlantPlanById(String id){
        return plantPlanRepository.findById(id);
    }

    /**
     * Updates an existing PlantPlan with the given ID using the provided updated data.
     *
     * @param id The unique identifier of the PlantPlan to be updated.
     * @param update The updated PlantPlan data. The ID will be set to match the given ID.
     * @return The updated {@link PlantPlan} saved in the database.
     */
    public PlantPlan updatePlantPlan(String id, PlantPlan update){
        update.setId(id);
        return plantPlanRepository.save(update);
    }

    /**
     * Deletes a PlantPlan by its unique identifier.
     *
     * @param id The unique identifier of the PlantPlan to delete.
     *           If the ID does not exist, no action is taken.
     */
    public void deletePlantPlan(String id){
        plantPlanRepository.deleteById(id);
    }

}
