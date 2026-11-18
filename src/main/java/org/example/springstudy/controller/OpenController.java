package org.example.springstudy.controller;

import org.example.springstudy.data.Gender;
import org.example.springstudy.data.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OpenController {

    private List<Person> persons = new ArrayList<>();

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

    @PostMapping("/persons")
    public String addPerson() {
        System.out.println("POST /persons 호출");

        Person person = new Person("문현욱", 27, 183.0, Gender.MALE);
        persons.add(person);
        return "OK";
    }

    @GetMapping("/persons")
    public String getPerson() {
        System.out.println("GET /persons 호출");

        System.out.println(persons);
        return "OK";
    }

    @GetMapping("/persons/{id}")
    public String person(
            @PathVariable long id
    ) {
        return "person id: " + id;
    }
}
