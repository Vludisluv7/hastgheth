package ru.me.my.controller;

import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@AllArgsConstructor
public class Controller {


    // Method to view as a guest
    @GetMapping("/")
    public String getViewAsGuest(Model model) {
        return "showroom";
    }

    // Method for user profile
    @GetMapping("/user-profile")
    public String getViewAsCommonUser(Model model) {
        return "user-profile";
    }

    @GetMapping("/admin-profile")
    public String getViewAsAdmin(Model model) {
        return "admin-profile";
    }

}