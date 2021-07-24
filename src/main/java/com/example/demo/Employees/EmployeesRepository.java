package com.example.demo.Employees;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeesRepository {

    List<EmployeesDTO> getAllEmployees() throws Exception;

}
