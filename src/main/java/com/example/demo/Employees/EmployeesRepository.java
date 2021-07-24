package com.example.demo.Employees;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeesRepository {

    List<EmployeesDTO> getAllEmployees() throws Exception;

    List<EmployeesDTO> getPageEmployees(
            @Param("page") Integer page,
            @Param("perPage") Integer perPage
    ) throws Exception;

    List<EmployeesDTO> getSelectEmployee(@Param("employeeNumber") int employeeNumber) throws Exception;
}
