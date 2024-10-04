package com.project.employeeservice.service;

import com.project.employeeservice.dto.EmployeeDTO;
import com.project.employeeservice.dto.EmployeeDeptDTO;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDeptDTO getEmployeeByID(Long employeeID);
}
