package com.example.Course_Registration_System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String emailid;
    private String coursename;

    public CourseRegistry(String name, String coursename, String emailid) {
        this.name = name;
        this.coursename = coursename;
        this.emailid = emailid;
    }

    public CourseRegistry() {
    }
}
