package com.github.andclima.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloMundo {

    @GetMapping("/alo") // URI
    public String aloMundo() {
        return "E aí?! Tudo bem? Alô mundo!";
    }
    
    @GetMapping("/alo2") // URI
    public String aloAnderson() {
        return "E aí, Anderson?! Alô de novo!";
    }
}
