package com.dinessh.altimetrik.departmentService.dto;

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
    private String departmentCode;
}