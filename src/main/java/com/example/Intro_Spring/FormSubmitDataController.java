package com.example.Intro_Spring;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormSubmitDataController {

    @PostMapping("login")
    public String login(
            @ModelAttribute UserCredential inputFormSubmit
    ){
        System.out.println("username" + inputFormSubmit);
        System.out.println("password" + inputFormSubmit);

        return String.format(" username : %s password : %s", inputFormSubmit.getUsername(), inputFormSubmit.getPassword());
    }
}
