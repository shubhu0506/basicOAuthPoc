package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping(value = "/user")
    @PreAuthorize("hasAuthority('SCOPE_readuser')")
    public String getUser() {
        return "Access Granted: for User to Get ";
    }

    @PostMapping(value = "/user")
    @PreAuthorize("hasAuthority('SCOPE_updateuser')")
    public String postUser() {
        return "Access Granted: for User to Update ";
    }
}
