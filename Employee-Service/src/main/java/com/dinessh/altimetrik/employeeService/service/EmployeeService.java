package com.dinessh.altimetrik.employeeService.service;

import com.dinessh.altimetrik.employeeService.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(long employeeId);
}
