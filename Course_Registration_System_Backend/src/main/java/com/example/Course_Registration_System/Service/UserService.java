package com.example.Course_Registration_System.Service;

import com.example.Course_Registration_System.Model.Users;
import com.example.Course_Registration_System.Repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder(12);
    @Autowired
    UserDetailsRepo repo;

    public void addUser(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
