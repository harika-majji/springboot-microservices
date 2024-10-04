package com.project.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDeptDTO {
    private EmployeeDTO employeeDTO;
    private DepartmentDTO departmentDTO;
}
