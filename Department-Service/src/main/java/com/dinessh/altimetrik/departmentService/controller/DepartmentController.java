package com.dinessh.altimetrik.departmentService.controller;

import com.dinessh.altimetrik.departmentService.dto.DepartmentDto;
import com.dinessh.altimetrik.departmentService.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService service;

    @PostMapping
    public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto dto) {

        DepartmentDto savedDto = service.saveDepartment(dto);
        return new ResponseEntity<>(savedDto, HttpStatus.OK);
    }

    /*@GetMapping("/{departmentId}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("departmentId") long departmentId) {

        DepartmentDto savedDto = service.getDepartmentById(departmentId);
        return new ResponseEntity<>(savedDto, HttpStatus.OK);
    }
*/
    @GetMapping("/{departmentCode}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("departmentCode") String departmentCode) {

        DepartmentDto savedDto = service.getDepartmentByDepartmentCode(departmentCode);
        return new ResponseEntity<>(savedDto, HttpStatus.OK);
    }
}
