package com.webchat.users.infraestructure.inputAdapters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class NavigationAPI {

    private static final String REDIRECT = "redirect:";

    //TODO I need to set up the SpringBoot Security Configuration to display my own customized login
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }
}
