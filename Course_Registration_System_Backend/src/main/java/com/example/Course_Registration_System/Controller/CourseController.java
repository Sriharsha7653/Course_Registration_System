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



    @PostMapping("/course/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("coursename") String coursename,
                                 @RequestParam("emailid") String emailid) {
        service.registerCourse(name, coursename, emailid);
        return "hey " + name + " enrollment success";
    }

    @GetMapping("")
    public  String home(){
        return "Home Page success working";
    }



}
