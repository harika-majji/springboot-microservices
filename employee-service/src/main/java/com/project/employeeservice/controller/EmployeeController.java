package com.project.employeeservice.controller;


import com.project.employeeservice.dto.EmployeeDTO;
import com.project.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO savedEmployee = employeeService.saveEmployee(employeeDTO);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }
    @GetMapping("{employeeID}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long employeeID){
        EmployeeDTO savedEmployee = employeeService.getEmployeeByID(employeeID);

        return new ResponseEntity<>(savedEmployee, HttpStatus.OK);

    }
}
