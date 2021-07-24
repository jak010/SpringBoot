package com.example.demo.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<EmployeesDTO> getAllEmployee() throws Exception {
        System.out.println(employeesRepository.getAllEmployees());
        return employeesRepository.getAllEmployees();
    }


}
