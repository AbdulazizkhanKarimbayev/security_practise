package com.security.practise.repositories;
import com.security.practise.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select r from roles r where r.name = ?1")
    Role findByName(String roleName);
}
