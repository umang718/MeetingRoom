package com.meetingroom.controller;

import com.meetingroom.Services.UserServices;
import com.meetingroom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class applicationcontroller
{


    @Autowired
    UserServices userService;

    @RequestMapping("/Welcomepage")
    public String Welcome(HttpServletRequest request)
    {
        request.setAttribute("mode","MODE_HOME");
        return "Welcomepage";
    }

    @RequestMapping("/register")
    public String Registration(HttpServletRequest request){


        request.setAttribute( "mode","MODE_REGISTER");
        return "Welcomepage";
    }

    @PostMapping("/save-user")
    public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request)

    {
        userService.SaveMyUser(user);
        request.setAttribute("mode","MODE_HOME");
        return "Welcomepage";
    }
}
