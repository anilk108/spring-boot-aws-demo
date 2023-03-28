package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.DepartmentDto;
import net.javaguides.employeeservice.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// handles only one url, no loading balancing
//@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
// service has multiple instances, only service id to achieve load balancing automatically.
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    // build get rest api for calling department service
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartmentByCode(@PathVariable("department-code") String code);
}
