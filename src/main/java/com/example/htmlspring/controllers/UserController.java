package com.example.htmlspring.controllers;

import com.example.htmlspring.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private UserRepository userRepo = new UserRepository();

    @GetMapping("/single-user")
    public String singleUser(Model model){
        String username = userRepo.getSingleUser();
        model.addAttribute("usernameMalthe",username);
        return "single-user";
    }
}
