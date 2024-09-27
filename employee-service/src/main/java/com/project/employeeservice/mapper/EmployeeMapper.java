package com.project.employeeservice.mapper;

import com.project.employeeservice.dto.EmployeeDTO;
import com.project.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDTO mapToEmployeeDTO(Employee employee);
    Employee mapToEmployee(EmployeeDTO employeeDTO);

}
