package com.dinessh.altimetrik.employeeService.controller;

import com.dinessh.altimetrik.employeeService.dto.ApiResponseDto;
import com.dinessh.altimetrik.employeeService.dto.EmployeeDto;
import com.dinessh.altimetrik.employeeService.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService service;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto dto) {

        EmployeeDto savedEmployee = service.saveEmployee(dto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<ApiResponseDto> getEmployeeById(@PathVariable long employeeId) {

        ApiResponseDto apiResponseDto = service.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
