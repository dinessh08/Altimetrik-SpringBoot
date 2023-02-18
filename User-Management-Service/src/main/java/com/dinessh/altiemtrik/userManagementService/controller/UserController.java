package com.dinessh.altiemtrik.userManagementService.controller;

import com.dinessh.altiemtrik.userManagementService.dto.UserDTO;
import com.dinessh.altiemtrik.userManagementService.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    private UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){

        UserDTO savedUser = service.saveUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Long id){

        UserDTO userDto = service.getUserById(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
