package com.example.Course_Registration_System.Repository;

import com.example.Course_Registration_System.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Users,Integer> {
}
