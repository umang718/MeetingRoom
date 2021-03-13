package com.meetingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class applicationcontroller
{


    @RequestMapping("/Welcomepage")
    public String Welcome()
    {
        return "Welcomepage";
    }
}