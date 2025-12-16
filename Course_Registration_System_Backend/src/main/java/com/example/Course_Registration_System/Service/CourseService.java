package com.example.Course_Registration_System.Service;

import com.example.Course_Registration_System.Model.Course;
import com.example.Course_Registration_System.Model.CourseRegistry;
import com.example.Course_Registration_System.Repository.CourseRegistryRepository;
import com.example.Course_Registration_System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository repo;

    @Autowired
    CourseRegistryRepository courseregistryrepo;

    public List<Course> availableCourses() {
        return repo.findAll();
    }


    public List<CourseRegistry> registeredStudent() {
        return courseregistryrepo.findAll();
    }

    public void registerCourse(String name, String emailid, String courseName) {
        CourseRegistry register = new CourseRegistry(name, emailid, courseName);
        courseregistryrepo.save(register);
    }


    public void addCourse(String courseId, String courseName, String trainer, int durationInWeeks) {
        Course course = new Course(courseId, courseName, trainer, durationInWeeks);
        repo.save(course);
    }
}
