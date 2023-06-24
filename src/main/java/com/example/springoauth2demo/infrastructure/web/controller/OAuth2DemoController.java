package com.example.springoauth2demo.infrastructure.web.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class OAuth2DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/start")
    @Secured("ROLE_USER")
    public String start() {
        return "start";
    }
}
