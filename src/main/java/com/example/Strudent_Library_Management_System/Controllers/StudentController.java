package com.example.Strudent_Library_Management_System.Controllers;

import com.example.Strudent_Library_Management_System.Model.Student;
import com.example.Strudent_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student){
        studentService.addStudent(student);
        return "Student has been enrolled!";
    }
}
