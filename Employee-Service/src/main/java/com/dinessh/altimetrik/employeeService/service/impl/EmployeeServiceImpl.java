package com.dinessh.altimetrik.employeeService.service.impl;

import com.dinessh.altimetrik.employeeService.dto.EmployeeDto;
import com.dinessh.altimetrik.employeeService.dto.EmployeeMapper;
import com.dinessh.altimetrik.employeeService.entity.Employee;
import com.dinessh.altimetrik.employeeService.repo.EmployeeRepository;
import com.dinessh.altimetrik.employeeService.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repo;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapper.mapToEmployee(employeeDto);
        Employee savedEmployee = repo.save(employee);
        EmployeeDto savedEmployeeDto = EmployeeMapper.mapper.mapToEmployeeDto(savedEmployee);
        return savedEmployeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(long employeeId) {

        Employee entity = repo.findById(employeeId).orElse(new Employee());
        EmployeeDto dto = EmployeeMapper.mapper.mapToEmployeeDto(entity);
        return dto;
    }
}
