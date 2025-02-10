package com.srs.SpringOauth2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/")
    public String getHome() {
        return "Home page";
    }

}
