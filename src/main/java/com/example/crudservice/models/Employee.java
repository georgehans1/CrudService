package com.example.crudservice.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("employees")
@Data
@Builder
public class Employee {
    @Id
    private String id;

    private String employeeID;
    private String name;
    private String employeeRole;
    private String projectLead;


    public Employee(String id, String employeeID, String name, String employeeRole, String projectLead) {
        this.id = id;
        this.employeeID = employeeID;
        this.name = name;
        this.employeeRole = employeeRole;
        this.projectLead = projectLead;
    }
}
