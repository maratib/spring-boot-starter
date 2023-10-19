package com.mak.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Api {

    @GetMapping
    public String index() {
        return "Hello, from Spring Boot";

    }

}
