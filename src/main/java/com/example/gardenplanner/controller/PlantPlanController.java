package com.example.gardenplanner.controller;


import com.example.gardenplanner.model.PlantPlan;
import com.example.gardenplanner.service.PlantPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.controller
 * File: PlantPlanController.java
 * Author: Ochwada
 * Date: Wednesday, 09.Jul.2025, 4:35 PM
 * Description:  REST Controller for mapping HTTP's Requests' URL's with Java methods.
 * - Used for managing Plant planner data.
 * - Talks to Web Client and Service layer.
 * Objective:
 * *******************************************************
 */

@RestController
@RequestMapping("/api/plans")
public class PlantPlanController {
    // Dependency on the PlantPlanService to delegate business logic
    private final PlantPlanService service;

    /**
     * Constructor-based dependency injection for the PlantPlanService.
     * Spring will automatically inject the required bean at runtime.
     *
     * @param service the service handling PlantPlan-related operations
     */
    @Autowired
    public PlantPlanController(PlantPlanService service) {
        this.service = service;
    }

    /**-------------------------------------------------------------
     * API endpoints (e.g., @GetMapping, @PostMapping) can be defined here.
     --------------------------------------------------------------*/
    /**
     * Adds a new PlantPlan to the database.
     *
     * @param plan The PlantPlan object received in the request body.
     * @return The saved {@link PlantPlan} object.
     */
    @PostMapping("/add-plan")
    public PlantPlan addPlan(@Valid @RequestBody PlantPlan plan){
        return service.addPlantPlans(plan);
    }

    /**
     * Retrieves all PlantPlans from the database.
     *
     * @return A list of all {@link PlantPlan} objects.
     */
    @GetMapping
    public List<PlantPlan> getAllPlans(){
        return service.getAllPlantPlans();
    }

    /**
     * Retrieves a specific PlantPlan by its unique ID.
     *
     * @param id The unique identifier of the PlantPlan.
     * @return A {@link ResponseEntity} containing the PlantPlan if found,
     *         or a 404 Not Found status if not.
     */
    @GetMapping("/{id}")
    public ResponseEntity<PlantPlan> getPlanById(@PathVariable String id){
        return service.getPlantPlanById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Updates an existing PlantPlan by its unique identifier.
     *
     * @param id   The unique identifier of the PlantPlan to update.
     * @param plan The updated PlantPlan data received in the request body.
     * @return The updated {@link PlantPlan} object after saving to the database.
     */
    @PutMapping("/{id}")
    public PlantPlan updatePlan(@PathVariable String id,
                                @RequestBody PlantPlan plan){
        return service.updatePlantPlan(id, plan);
    }

    /**
     * Deletes a PlantPlan by its unique identifier.
     *
     * @param id The unique identifier of the PlantPlan to delete.
     * @return A {@link ResponseEntity} with HTTP status 204 No Content.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable String id){
        service.deletePlantPlan(id);
        return ResponseEntity.noContent().build();
    }

}
