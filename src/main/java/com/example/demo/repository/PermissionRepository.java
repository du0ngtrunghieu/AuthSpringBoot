package com.example.demo.repository;

import com.example.demo.model.Permission;
import com.example.demo.model.PermissionName;
import com.example.demo.model.Role;
import com.example.demo.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created on 16/3/2020.
 * Class: PermissionRepository.java
 * By : Admin
 */
public interface PermissionRepository extends JpaRepository<Permission,Long> {
    Optional<Permission> findByName(PermissionName permissionName);

}
