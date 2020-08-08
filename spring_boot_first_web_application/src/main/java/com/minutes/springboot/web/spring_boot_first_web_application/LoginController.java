package com.minutes.springboot.web.spring_boot_first_web_application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public String loginMessage(){
        return "Hello World";
    }
}
