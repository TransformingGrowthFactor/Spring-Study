package org.example.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenController {

    @GetMapping("/")
    public String hello() {
       return "Hello World!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/param")
    public String param(
            @RequestParam String name,
            @RequestParam(defaultValue = "40") Integer age
    ) {
        // return "Hello " + age + "살 먹은 " + name + "님"
        return "Hello %d드신 %s님".formatted(age, name);
    }
}
