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
            @RequestParam Map<String, String> param
    ) throws Exception {
        /*
         *  TODO
         *   - 필터링 적용해볼 것
         * */

        // Parameter Setup
        // Hack: 더 나은 방법이 필요할 듯 함
        String page = param.get("page");
        String perPage = param.get("perPage");

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
