package com.example.Course_Registration_System.Repository;

import com.example.Course_Registration_System.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
