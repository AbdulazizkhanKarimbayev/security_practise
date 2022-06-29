package com.security.practise.repositories;
import com.security.practise.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from users u where u.username = ?1")
    User findByUsername(String username);
}
