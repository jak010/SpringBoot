package com.example.demo.service;

import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;


    public List<Employees> getAllEmployee() throws Exception {
        System.out.println(employeesRepository.getAllEmployees());
        return employeesRepository.getAllEmployees();
    }
}
