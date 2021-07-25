package com.example.demo.Employees;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import com.example.demo.response.Message;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public ResponseEntity<Message> getEmployees(
            @RequestParam Map<String, String> param
    ) throws Exception {
        // Date fetch
        List<EmployeesDTO> data = employeeService.getEmployees(param);

        HttpHeaders header = new HttpHeaders();
        header.setContentType(
                new MediaType(
                        "application",
                        "json",
                        Charset.forName(StandardCharsets.UTF_8.name())
                )
        );

        Message response = new Message();
        response.setStatus_code(HttpStatus.OK.value());
        response.setCode("OK");
        response.setData(data);

        return new ResponseEntity<>(response, header, HttpStatus.OK);
    }

    @GetMapping(path = "/{employeeNumber}")
    public List<EmployeesDTO> selectEmployees(@PathVariable int employeeNumber) throws Exception {
        return employeeService.getSelectEmployee(employeeNumber);
    }

}
