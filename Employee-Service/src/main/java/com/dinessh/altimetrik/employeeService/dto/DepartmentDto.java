package com.dinessh.altimetrik.employeeService.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class DepartmentDto {

    private long id;
    private String departmentName;
    private String departmentDescription;
    @NotEmpty(message = "The Department code needs to be Unique and Non-empty")
    private String departmentCode;
}