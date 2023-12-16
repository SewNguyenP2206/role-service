package com.example.RoleService.Controller;


import com.example.RoleService.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController implements iRoleController {


    @Autowired
    RoleService roleService;
    @Override
    public String getRoleNameById(int id) {
        return roleService.getNameById(id);
    }
}
