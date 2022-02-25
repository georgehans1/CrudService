package com.example.crudservice.service;

import com.example.crudservice.models.Employee;
import com.example.crudservice.repository.EmployeeRepository;
import com.example.crudservice.request.EmployeeRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public HttpStatus createEmployee(EmployeeRequest employee){
        log.info("{}",employee);
        employeeRepository.save(Employee.builder().name(employee.getName()).employeeRole(employee.getEmployeeRole()).employeeID(employee.getEmployeeID()).projectLead(employee.getProjectLead()).build());
        return HttpStatus.CREATED;
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
}
