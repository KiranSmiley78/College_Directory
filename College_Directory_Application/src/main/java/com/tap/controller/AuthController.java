package com.tap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tap.entity.User;
import com.tap.service.AuthService;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        User user = authService.validateUser(username, password);
        if (user != null) {
            // Redirect to respective dashboards based on user role
            switch (user.getRole()) {
                case "STUDENT":
                    return "redirect:/student/profile";
                case "FACULTY_MEMBER":
                    return "redirect:/faculty/dashboard";
                case "ADMINISTRATOR":
                    return "redirect:/admin/dashboard";
                default:
                    return "login"; // fallback
            }
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}
