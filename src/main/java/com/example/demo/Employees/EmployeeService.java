package com.example.demo.Employees;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<EmployeesDTO> getEmployees(
            @RequestParam Map<String, String> customQuery
    ) throws Exception {
        // Parameter Setup
        String page = customQuery.get("page");
        String perPage = customQuery.get("perPage");

        // page와 perPage 가 없으면 전체 목록 조회
        if ((page == null) && (perPage == null)) {
            return employeesRepository.getAllEmployees();
        }

        return employeesRepository.getPageEmployees(Integer.parseInt(page), Integer.parseInt(perPage));
    }

    public List<EmployeesDTO> getSelectEmployee(@Param("employeeNumber") int employeeNumber) throws Exception {
        /*
         *   TODO
         *     - NULL Check
         *     - Empty Value Check
         * */
        return employeesRepository.getSelectEmployee(employeeNumber);

    }


}
