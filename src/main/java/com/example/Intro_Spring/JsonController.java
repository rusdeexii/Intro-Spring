package com.example.Intro_Spring;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @PostMapping("loginJson")
    public String login(
            @RequestBody UserCredential inputFormDataJson
    ){
        System.out.println("username" + inputFormDataJson.getUsername());
        System.out.println("password" + inputFormDataJson.getPassword());

        return String.format(" username : %s password : %s", inputFormDataJson.getUsername(), inputFormDataJson.getPassword());
    }
}
