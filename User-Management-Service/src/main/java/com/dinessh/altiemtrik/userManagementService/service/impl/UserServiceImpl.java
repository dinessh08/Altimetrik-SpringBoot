package com.dinessh.altiemtrik.userManagementService.service.impl;

import com.dinessh.altiemtrik.userManagementService.dto.UserDTO;
import com.dinessh.altiemtrik.userManagementService.entity.User;
import com.dinessh.altiemtrik.userManagementService.repository.UserRepository;
import com.dinessh.altiemtrik.userManagementService.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repo;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {

        User entity = new User();
        User savedEntity = repo.save(entity);
        UserDTO savedDto = new UserDTO();
        return savedDto;
    }

    @Override
    public UserDTO getUserById(long id) {

        User entity = repo.findById(id).orElse(new User());
        UserDTO savedDto = new UserDTO();
        return savedDto;
    }
}
