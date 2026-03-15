package com.example.Course_Registration_System;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
        String pt="5353";
        String hashed= passwordEncoder.encode(pt);
        System.out.println(hashed+":");
    }
}
