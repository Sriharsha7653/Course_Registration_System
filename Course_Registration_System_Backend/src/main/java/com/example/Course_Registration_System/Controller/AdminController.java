package com.example.Course_Registration_System.Controller;

import com.example.Course_Registration_System.Model.CourseRegistry;
import com.example.Course_Registration_System.Model.Users;
import com.example.Course_Registration_System.Service.CourseService;
import com.example.Course_Registration_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CourseService service;
    @GetMapping("/course/registered")
    public List<CourseRegistry> registeredstudent() {
        return service.registeredStudent();
    }
    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    public  void addUser(@RequestBody Users user){
        userService.addUser(user);
    }
    @PostMapping("/addcourse")
    public String addCourse(
            @RequestParam("courseId") String courseId,
            @RequestParam("courseName") String courseName,
            @RequestParam("trainer") String trainer,
            @RequestParam("durationInWeeks") int durationInWeeks) {

        service.addCourse(courseId, courseName, trainer, durationInWeeks);
        return "Course added successfully";
    }
    @GetMapping("/adminlevelusers")
    public List<Users> admins(){
       return service.admin();
    }
}
