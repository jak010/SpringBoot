package com.example.demo.mapper;



import java.util.List;
import com.example.demo.vo.EmployeesDTO;
import org.apache.ibatis.annotations.Param;

public interface EmployeesMapper {
    // 모든 직원 가져오기
    public List<EmployeesDTO> getAllEmployees() throws Exception;

    // 특정 Employee 만 가져오기
    public EmployeesDTO getSelectEmployees(@Param("employeeNumber") int employeeNumber) throws Exception;


}
