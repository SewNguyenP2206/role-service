package com.example.RoleService.Service;


import com.example.RoleService.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{

    @Autowired
    RoleRepository roleRepository;
    @Override
    public String getNameById(int id) {
        return roleRepository.getNameById(id);
    }
}
