package com.dinessh.altiemtrik.userManagementService.repository;

import com.dinessh.altiemtrik.userManagementService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
