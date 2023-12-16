package com.example.RoleService.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/role")
public interface iRoleController {

    @GetMapping("/name/{id}")
    public String getRoleNameById(@PathVariable int id);
}
