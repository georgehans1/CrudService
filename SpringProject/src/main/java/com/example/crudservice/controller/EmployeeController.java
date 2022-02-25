package com.example.crudservice.controller;

import com.example.crudservice.models.Employee;
import com.example.crudservice.request.EmployeeRequest;
import com.example.crudservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public HttpStatus addEmployee(@RequestBody EmployeeRequest employee){
        employeeService.createEmployee(employee);
        return HttpStatus.OK;
    }


    @GetMapping("/all")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

}
