package com.example.Course_Registration_System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;

    public Course() {
    }
}
