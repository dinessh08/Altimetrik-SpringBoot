package com.dinessh.altimetrik.employeeService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponseDto {

    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;
}
