 # Urban Garden Planner

Welcome MongoDB + Spring Boot Micro Project!

A RESTful API to help urban gardeners plan and track their plantings.  Instead of a shop or library example, this will 
let users store and retrieve information about the plants they want to grow, their care instructions, and seasonal notes.

### Goal of the Assignment
- Learn how to integrate Spring Boot with MongoDB Atlas 
- Understand RESTful API design 
- Practice data modeling in MongoDB 
- Apply algorithmic thinking to CRUD design 
- Work with real-world inspired domain

###  Background Explanation
Urban gardening is growing in popularity. But many gardeners struggle to track:

- Which plants they want to grow 
- Planting dates 
- Care instructions 
- Notes about growth and harvest

Task: Design a REST API that lets users store and manage their personal urban garden plan.

Each **PlantPlan** record contains:

| Field          | Type    | Description                         |
| --------------- | ------- | ----------------------------------- |
| id              | String  | Unique identifier                   |
| name            | String  | Name of the plant                   |
| plantingSeason  | String  | Recommended planting season         |
| sunlightNeeds   | String  | Sunlight requirements               |
| wateringFreq    | String  | How often to water                  |
| notes           | String  | Additional notes                    |


###### Why This Project?

1. 👉 It uses real-world thinking (planning, storing structured info)
2. 👉 It requires NoSQL design (flexible, schema-less)
3. 👉 It aligns with REST principles (resources, methods)
4. 👉 It will teach you step-by-step how to:
    - Model data
    - Create a Spring Boot project
    - Connect to MongoDB Atlas
    - Expose REST endpoints
5. 👉 Practice advanced REST design
6. 👉 Learn custom queries in Spring Data MongoDB 
7. 👉 Add update and delete endpoints 
8. 👉 Add validation for data integrity 
9. 👉 Add calculation endpoints for real-world value 