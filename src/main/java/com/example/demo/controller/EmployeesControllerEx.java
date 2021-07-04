package com.example.demo.controller;

import com.example.demo.model.Employees;
import com.example.demo.service.ExmployeesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesControllerEx {

    @Autowired
    private ExmployeesService employeesService;


    @GetMapping(path = "/test")
    public List<Employees> getEmployees() throws Exception {
        return employeesService.getAllEmployee();
    }

}
