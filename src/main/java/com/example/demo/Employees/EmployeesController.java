package com.example.demo.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<EmployeesDTO> getEmployees() throws Exception {
        return employeeService.getAllEmployee();
    }

}
