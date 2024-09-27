package com.project.department_service.mapper;

import com.project.department_service.dto.DepartmentDTO;
import com.project.department_service.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);
    DepartmentDTO mapToDepartmentDTO(Department department);
    Department mapToDepartment(DepartmentDTO departmentDTO);

}
