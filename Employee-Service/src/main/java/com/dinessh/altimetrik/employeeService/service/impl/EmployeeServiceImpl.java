package com.dinessh.altimetrik.employeeService.service.impl;

import com.dinessh.altimetrik.employeeService.dto.ApiResponseDto;
import com.dinessh.altimetrik.employeeService.dto.DepartmentDto;
import com.dinessh.altimetrik.employeeService.dto.EmployeeDto;
import com.dinessh.altimetrik.employeeService.dto.EmployeeMapper;
import com.dinessh.altimetrik.employeeService.entity.Employee;
import com.dinessh.altimetrik.employeeService.repo.EmployeeRepository;
import com.dinessh.altimetrik.employeeService.service.APIClient;
import com.dinessh.altimetrik.employeeService.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repo;
    private RestTemplate restTemplate;
    private WebClient webClient;
    private APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapper.mapToEmployee(employeeDto);
        Employee savedEmployee = repo.save(employee);
        EmployeeDto savedEmployeeDto = EmployeeMapper.mapper.mapToEmployeeDto(savedEmployee);
        return savedEmployeeDto;
    }

    @Override
    public ApiResponseDto getEmployeeById(long employeeId) {

        Employee entity = repo.findById(employeeId).orElse(new Employee());
        EmployeeDto employeeDto = EmployeeMapper.mapper.mapToEmployeeDto(entity);

        String departmentCode = employeeDto.getDepartmentCode();
        //DepartmentDto departmentDto = restTemplate.getForEntity("http://localhost:8070/api/department/" + departmentCode, DepartmentDto.class).getBody();
        DepartmentDto departmentDto = webClient.get().uri("http://localhost:8070/api/department/" + departmentCode).retrieve().bodyToMono(DepartmentDto.class).block();
        //DepartmentDto departmentDto = apiClient.getDepartmentByCode(departmentCode);
        ApiResponseDto responseDto = new ApiResponseDto();
        responseDto.setEmployeeDto(employeeDto);
        responseDto.setDepartmentDto(departmentDto);

        return responseDto;
    }
}
