package com.dinessh.altiemtrik.userManagementService.service;

import com.dinessh.altiemtrik.userManagementService.dto.UserDTO;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);
    UserDTO getUserById(long id);
}
