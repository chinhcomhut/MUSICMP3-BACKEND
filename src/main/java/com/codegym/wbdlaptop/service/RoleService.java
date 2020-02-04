package com.codegym.wbdlaptop.service;

import com.codegym.wbdlaptop.model.Role;
import com.codegym.wbdlaptop.model.RoleName;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(RoleName roleName);
}
