package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {

    @GetMapping(value = "/me", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hallo(){

        return "hallo Dorota";
    }

    @GetMapping(value = "/unknows", produces = MediaType.APPLICATION_JSON_VALUE)
    public String halloUnknown(){

        return "hallo Unknown";
    }




}
