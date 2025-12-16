package com.example.Course_Registration_System.Controller;

import com.example.Course_Registration_System.Model.Course;
import com.example.Course_Registration_System.Model.CourseRegistry;
import com.example.Course_Registration_System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("/courses")
    public List<Course> AvailableCourses() {
        return service.availableCourses();
    }

    @GetMapping("/course/registered")
    public List<CourseRegistry> registeredstudent() {
        return service.registeredStudent();
    }

    @PostMapping("/course/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("coursename") String coursename,
                                 @RequestParam("emailid") String emailid) {
        service.registerCourse(name, coursename, emailid);
        return "hey " + name + " enrollment success";
    }


    @PostMapping("/course/addcourse")
    public String addCourse(
            @RequestParam("courseId") String courseId,
            @RequestParam("courseName") String courseName,
            @RequestParam("trainer") String trainer,
            @RequestParam("durationInWeeks") int durationInWeeks) {

        service.addCourse(courseId, courseName, trainer, durationInWeeks);
        return "Course added successfully";
    }

}
