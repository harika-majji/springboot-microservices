package com.project.department_service.service;

import com.project.department_service.dto.DepartmentDTO;

public interface DepartmentService {

    DepartmentDTO saveDepartment(DepartmentDTO department);
    DepartmentDTO getDepartmentByCode(String departmentCode);
}
