package com.security.practise.service;
import com.security.practise.domain.Role;
import com.security.practise.domain.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    void saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
