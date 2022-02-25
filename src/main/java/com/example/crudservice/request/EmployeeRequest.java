package com.example.crudservice.request;
import lombok.Data;

@Data
public class EmployeeRequest {
    private String name;
    private String employeeRole;
    private String employeeID;
    private String projectLead;
}
