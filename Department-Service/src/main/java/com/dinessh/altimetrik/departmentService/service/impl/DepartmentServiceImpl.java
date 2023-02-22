package com.dinessh.altimetrik.departmentService.service.impl;

import com.dinessh.altimetrik.departmentService.dto.DepartmentDto;
import com.dinessh.altimetrik.departmentService.entity.Department;
import com.dinessh.altimetrik.departmentService.repo.DepartmentRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements com.dinessh.altimetrik.departmentService.service.DepartmentService {

    private DepartmentRepo repo;

    private ModelMapper modelMapper;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department entity = this.modelMapper.map(departmentDto, Department.class);
        Department savedDepartment = repo.save(entity);
        DepartmentDto dto = this.modelMapper.map(savedDepartment, DepartmentDto.class);
        return dto;
    }

    @Override
    public DepartmentDto getDepartmentById(long departmentId) {

        Department savedDepartment = repo.findById(departmentId).orElse(new Department());
        DepartmentDto dto = this.modelMapper.map(savedDepartment, DepartmentDto.class);
        return dto;
    }

    @Override
    public DepartmentDto getDepartmentByDepartmentCode(String departmentCode) {

        Department savedDepartment = repo.findByDepartmentCode(departmentCode);
        DepartmentDto dto = this.modelMapper.map(savedDepartment, DepartmentDto.class);
        return dto;
    }
}
