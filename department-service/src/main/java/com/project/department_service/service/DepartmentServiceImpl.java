package com.project.department_service.service;

import com.project.department_service.dto.DepartmentDTO;
import com.project.department_service.entity.Department;
import com.project.department_service.exceptions.ResourceNotFoundException;
import com.project.department_service.mapper.DepartmentMapper;
import com.project.department_service.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    DepartmentRepository departmentRepository;

    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO){

        Department department= DepartmentMapper.MAPPER.mapToDepartment(departmentDTO);

        Department savedDepartment = departmentRepository.save(department);
        DepartmentDTO savedDepartmentDTO = DepartmentMapper.MAPPER.mapToDepartmentDTO(savedDepartment);

        return savedDepartmentDTO;
    }

    public DepartmentDTO getDepartmentByCode(String departmentCode){
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        if (department == null){
            throw new ResourceNotFoundException(String.format("Department with code %s not found",departmentCode));

        }
        DepartmentDTO departmentDTO = DepartmentMapper.MAPPER.mapToDepartmentDTO(department);
        return departmentDTO;
    }
}
