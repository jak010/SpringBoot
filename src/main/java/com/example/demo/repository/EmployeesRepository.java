package com.example.demo.repository;

import com.example.demo.model.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface EmployeesRepository {

    List<Employees> getAllEmployees() throws Exception;


}