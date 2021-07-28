package com.example.demo.Employees;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeesRepository {

    // hacks: 더 나은 방법이 필요할 듯 -1
    List<EmployeesDTO> getAllEmployees() throws Exception;

    // hacks: 더 나은 방법이 필요할 듯 -1
    List<EmployeesDTO> getPageEmployees(
            @Param("page") Integer page,
            @Param("perPage") Integer perPage
    ) throws Exception;

    // Select Employee Row
    List<EmployeesDTO> getSelectEmployee(@Param("employeeNumber") int employeeNumber) throws Exception;

    // Generate Employee Row
    List<EmployeesDTO> generateEmployee(@Param("employeeNumber") int employeeNumber) throws Exception;
}
