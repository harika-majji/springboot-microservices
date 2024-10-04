package com.project.employeeservice.service;

import com.project.employeeservice.dto.DepartmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// service registry takes care of the port and host details implementing load balancing
@FeignClient(name = "DEPARTMENT-SERVICE")
//@FeignClient(url = "http://localhost:8081", name = "Department-Service") without load balancer and service registry
public interface APIClient {

    @GetMapping("api/departments/{departmentCode}")
    DepartmentDTO getDepartmentByCode(@PathVariable String departmentCode);
}
