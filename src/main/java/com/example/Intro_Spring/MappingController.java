package com.example.Intro_Spring;

import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    @GetMapping("Start")
    public String HelloWorld() {
        return "Hello World";
    }

    @PostMapping("post")
    public String HelloWorld2() {
        return "Hello World2";
    }
    @RequestMapping(path = "hello1", method = {
            RequestMethod.GET,
            RequestMethod.POST
    })

    public String HelloWorld3() {
        return "Hello World3";
    }

    @GetMapping ("params")
    public String params(
            @RequestParam(name= "name") String inputParameter,
            @RequestParam(name= "age") Integer inputAge) {

        return String.format("Name = %s Age = %d", inputParameter, inputAge);
    }
}
