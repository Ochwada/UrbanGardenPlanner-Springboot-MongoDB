package com.example.gardenplanner.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************************************
 * Package: com.example.gardenplanner.controller
 * File: RootController.java
 * Author: Ochwada
 * Date: Thursday, 10.Jul.2025, 5:12 PM
 * Description:
 * Objective:
 * *******************************************************
 */

@RestController
public class RootController {
    @GetMapping("/")
    public String home() {
        return "🌱 Plant Planner API is running!";
    }
}
