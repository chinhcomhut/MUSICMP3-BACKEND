package com.codegym.wbdlaptop.repository;

import com.codegym.wbdlaptop.model.Role;
import com.codegym.wbdlaptop.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(RoleName roleName);
}
