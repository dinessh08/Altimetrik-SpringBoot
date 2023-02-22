package com.dinessh.altimetrik.departmentService.repo;

import com.dinessh.altimetrik.departmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
