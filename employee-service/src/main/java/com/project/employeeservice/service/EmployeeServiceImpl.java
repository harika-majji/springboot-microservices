package com.project.employeeservice.service;

import com.project.employeeservice.dto.EmployeeDTO;
import com.project.employeeservice.entity.Employee;
import com.project.employeeservice.mapper.EmployeeMapper;
import com.project.employeeservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        Employee employee = EmployeeMapper.MAPPER.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDTO savedDto = EmployeeMapper.MAPPER.mapToEmployeeDTO(savedEmployee);
        return  savedDto;

    }

    @Override
    public EmployeeDTO getEmployeeByID(Long employeeID) {
        Employee employee= employeeRepository.findById(employeeID).get();
        EmployeeDTO emp = EmployeeMapper.MAPPER.mapToEmployeeDTO(employee);
        return emp;

    }
}
