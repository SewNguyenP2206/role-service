package com.example.RoleService.Repository;


import com.example.RoleService.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

    @Query("Select r.name from Role r where r.id = ?1")
    public String getNameById(int id);
}
