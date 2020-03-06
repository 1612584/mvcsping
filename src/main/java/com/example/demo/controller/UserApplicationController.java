package com.example.demo.controller;

import com.example.demo.model.UserApplication;
import com.example.demo.service.UserApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserApplicationController {
    private UserApplicationService userService;

    public UserApplicationController(UserApplicationService userService) {
        this.userService = userService;
    }

    @GetMapping
    List<UserApplication> findByName(@RequestParam String name){
        return userService.findByName(name);
    }
}
