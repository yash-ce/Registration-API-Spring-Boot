package com.yash.greenstitch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
public class GreetingController {


    @SecurityRequirement(
            name = "Bear Authentication"
    )
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){

        return new ResponseEntity<>("Hello from GreenStitch", HttpStatus.OK);
    }
    
}
