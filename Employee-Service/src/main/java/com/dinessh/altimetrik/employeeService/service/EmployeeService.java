package com.dinessh.altimetrik.employeeService.service;

import com.dinessh.altimetrik.employeeService.dto.ApiResponseDto;
import com.dinessh.altimetrik.employeeService.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(long employeeId);
}
