package com.timer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String homeRedirect(){
        return "<html><head><meta http-equiv=\"refresh\" content=\"0; url=/index.html\" /></head></html>";
    }

}
