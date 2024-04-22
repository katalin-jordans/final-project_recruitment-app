package com.ironhack.controller.interfaces;

import com.ironhack.dtos.RoleToUserDTO;
import com.ironhack.model.Role;

public interface RoleControllerInterface {
    void saveRole(Role role);

    void addRoleToUser(RoleToUserDTO roleToUserDTO);
}
