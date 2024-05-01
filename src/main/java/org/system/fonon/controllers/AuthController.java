package org.system.fonon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.system.fonon.entities.User;
import org.system.fonon.services.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public String home() {
        return "index";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute("User") User user) {
        userService.save(user);
        System.out.println(user);
        return "sign";
    }
    @GetMapping("/login")
    public String login() {
         return "sign";
    }
    @GetMapping("/userPage")
    public String userPage() {
        return "userPage";
    }
    @GetMapping
    public String adminPage() {
        return "adminPage";
    }
}
