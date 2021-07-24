package com.example.demo.Employees;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<EmployeesDTO> getEmployees(
            @RequestParam Map<String, String> customQuery
    ) throws Exception {

        return employeeService.getEmployees(customQuery);
    }

    @GetMapping(path = "/{employeeNumber}")
    public List<EmployeesDTO> selectEmployees(@PathVariable int employeeNumber) throws Exception {
        return employeeService.getSelectEmployee(employeeNumber);
    }

}
