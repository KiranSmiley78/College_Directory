package com.tap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tap.entity.StudentProfile;
import com.tap.service.StudentService;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/profile")
    public String viewProfile(Model model) {
        Long userId = 1L;
        StudentProfile profile = studentService.getStudentProfile(userId);
        model.addAttribute("profile", profile);
        return "student_profile";
    }
}
