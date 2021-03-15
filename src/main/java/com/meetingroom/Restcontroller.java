package com.meetingroom;

import com.meetingroom.Services.UserServices;
import com.meetingroom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Restcontroller
{
    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String hello()
    {
        return "This is home page";
    }
    @GetMapping("/saveuser")
    public String saveUser(@RequestParam String Username, @RequestParam String Firstname, @RequestParam String Lastname, @RequestParam Integer mobile, @RequestParam String Password)
    {
        User user= new User(Username, Firstname, Lastname, mobile, Password);
        userServices.SaveMyUser(user);
        return "User is saved";

    }
}
