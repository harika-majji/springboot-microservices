package com.project.employeeservice.service;

import com.project.employeeservice.dto.DepartmentDTO;
import com.project.employeeservice.dto.EmployeeDTO;
import com.project.employeeservice.dto.EmployeeDeptDTO;
import com.project.employeeservice.entity.Employee;
import com.project.employeeservice.mapper.EmployeeMapper;
import com.project.employeeservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;
//    RestTemplate restTemplate;
//    WebClient webClient;
    private APIClient apiClient;
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        System.out.println(employeeDTO.getDepartmentCode());
        Employee employee = EmployeeMapper.MAPPER.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDTO savedDto = EmployeeMapper.MAPPER.mapToEmployeeDTO(savedEmployee);
        return  savedDto;

    }

    @Override
    public EmployeeDeptDTO getEmployeeByID(Long employeeID) {
        Employee employee= employeeRepository.findById(employeeID).get();
//        RestTemplate pattern
//        ResponseEntity<DepartmentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departments/"+employee.getDepartmentCode(), DepartmentDTO.class);
//        DepartmentDTO departmentDTO = responseEntity.getBody();

//        WebClient
//        DepartmentDTO departmentDTO = webClient.get()
//                .uri("http://localhost:8080/api/departments/"+employee.getDepartmentCode())
//                .retrieve().bodyToMono(DepartmentDTO.class).block();

//        FeignClient
        DepartmentDTO departmentDTO = apiClient.getDepartmentByCode(employee.getDepartmentCode());

        EmployeeDTO empDTO = EmployeeMapper.MAPPER.mapToEmployeeDTO(employee);
        EmployeeDeptDTO employeeDeptDTO = new EmployeeDeptDTO(empDTO,departmentDTO);
        return employeeDeptDTO;

    }
}
