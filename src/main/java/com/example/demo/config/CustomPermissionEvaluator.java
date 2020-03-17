package com.example.demo.config;

import com.example.demo.model.PermissionName;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Set;

/**
 * Created on 16/3/2020.
 * Class: CustomPermissionEvaluator.java
 * By : Admin
 */
@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean hasPermission(Authentication auth,
                                 Object targetDomainObject, Object permission) {
        UserPrincipal loggedInUser =
                (auth == null || auth.getPrincipal() == null)
                        ?  null
                        : (UserPrincipal) auth.getPrincipal();
        if (targetDomainObject == null)
            return true;
        boolean isAllowed = false;
        User user = userRepository.findById(loggedInUser.getId()).orElse(null);
        switch (permission.toString()){
            case "UPDATE":

                return true;
        }

        return isAllowed;
    }

    @Override
    public boolean hasPermission(final Authentication authentication,final Serializable serializable, String s, Object o) {
        throw new UnsupportedOperationException(
                "hasPermission() by ID is not supported");
    }
}
