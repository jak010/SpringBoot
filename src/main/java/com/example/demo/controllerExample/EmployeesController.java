//package com.example.demo.controller;
//
//// Built-in
//import java.util.List;
//import javax.sql.DataSource;
//
//// DTO && Mapper
//import com.example.demo.model.Employees;
//import com.example.demo.Employees.EmployeesDTO;
//import com.example.demo.mapper.EmployeesMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//// Third-Party
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@RestController
//public class EmployeesController {
//
//    @Autowired
//    private DataSource ds;
//
//    @Autowired
//    EmployeesMapper mapper;
//
////     Mapper를 통해 json으로 반환하기
////    @RequestMapping(path = "employees")
////    public String getAllEmployees() throws Exception {
////        /* @DESC
////         *  - Employee의 모든 데이터 반환
////         * */
////
////        String result = null;
////        ObjectMapper objectMapper = new ObjectMapper();
////
////        List<EmployeesDTO> emp_vo = mapper.getAllEmployees();
////
////        result = objectMapper.writeValueAsString(emp_vo);
////        return result;
////    }
//
//    @RequestMapping(path = "employees")
//    public ModelAndView employees() throws Exception {
//        /* html에 데이터 전달하기   */
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("employees");
//
//        List<EmployeesDTO> emp_vo = mapper.getAllEmployees();
//
//        mv.addObject("employees", emp_vo);
//        return mv;
//    }
//
//
//    @GetMapping(path = "employees/{employeeNumber}")
//    public ResponseEntity<String> getSelectEmployees(@PathVariable int employeeNumber) throws Exception {
//        /*  @DESC
//         *    : 특정 employees를 가져오기
//         *    : 기본적인 get 방식으로 사용하는 API
//         *  @Params
//         *    : param num: employees 번호
//         * */
//
//        String result = null;
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        EmployeesDTO emp_vo = mapper.getSelectEmployees(employeeNumber);
//
//        /* Null 체크는 여기서 */
//        if (emp_vo == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        result = objectMapper.writeValueAsString(emp_vo);
//        return ResponseEntity
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(result);
//    }
//
//}
