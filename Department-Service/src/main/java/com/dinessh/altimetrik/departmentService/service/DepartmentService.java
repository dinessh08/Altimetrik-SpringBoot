package com.dinessh.altimetrik.departmentService.service;

import com.dinessh.altimetrik.departmentService.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(long departmentId);

    DepartmentDto getDepartmentByDepartmentCode(String departmentCode);

}