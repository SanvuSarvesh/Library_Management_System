package com.example.Strudent_Library_Management_System.Controllers;

import com.example.Strudent_Library_Management_System.Model.Student;
import com.example.Strudent_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student){
        studentService.addStudent(student);
        return "Student has been enrolled!";
    }
    @GetMapping("/get_student")
    public String findNameByEmail(@RequestParam ("email") String email){
        return studentService.findNameByEmail(email);
    }
    @GetMapping("/get_studentsBycountry")
    public List<Student> findNameByCountry(String country){
        return studentService.findNameByCountry(country);
    }
    @PutMapping("/update_mobNo")
    public String updateMobileNo(@RequestBody  Student newStudent){
        return studentService.updateMobileNo(newStudent);
    }
}
