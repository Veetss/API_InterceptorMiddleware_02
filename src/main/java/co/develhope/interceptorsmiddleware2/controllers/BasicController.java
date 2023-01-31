package co.develhope.interceptorsmiddleware2.controllers;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/root")
public class BasicController {

    @GetMapping("")
    public String welcomeUser(){
        return "Welcome user!";
    }

}