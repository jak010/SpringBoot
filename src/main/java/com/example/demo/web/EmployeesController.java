package com.example.demo.web;


// Built-in

import java.util.List;
import javax.sql.DataSource;

// DTO && Mapper
import com.example.demo.model.EmployeesDTO;
import com.example.demo.mapper.EmployeesMapper;

// Third-Party
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeesController {

    @Autowired
    private DataSource ds;

    @Autowired
    EmployeesMapper mapper;

    @RequestMapping(path = "employees")
    public String getAllEmployees() throws Exception {
        /*
         *  @DESC
         *    Employee의 모든 데이터 반환
         *
         * */

        String result = null;
        ObjectMapper objectMapper = new ObjectMapper();

        List<EmployeesDTO> emp_vo = mapper.getAllEmployees();

        result = objectMapper.writeValueAsString(emp_vo);
        return result;
    }


    @GetMapping(path = "employees/{employeeNumber}")
    public ResponseEntity<String> getSelectEmployees(@PathVariable int employeeNumber) throws Exception {
        /*  @DESC
         *    : 특정 employees를 가져오기
         *
         *  @Params
         *    : param num: employees 번호
         * */

        String result = null;
        ObjectMapper objectMapper = new ObjectMapper();

        EmployeesDTO emp_vo = mapper.getSelectEmployees(employeeNumber);

        /* Null 체크는 여기서 */
        if (emp_vo == null) {
            return ResponseEntity.notFound().build();
        }

        result = objectMapper.writeValueAsString(emp_vo);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }

}
