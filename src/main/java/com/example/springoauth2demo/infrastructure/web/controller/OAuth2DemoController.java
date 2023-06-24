package com.example.springoauth2demo.infrastructure.web.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@Controller
public class OAuth2DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/start")
    @PreAuthorize("hasAuthority('OAUTH2_USER')")
    public String start(Principal principal) {
        System.out.println(principal);
        return "start";
    }
}
