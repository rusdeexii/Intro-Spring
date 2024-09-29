package com.example.Intro_Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeaderController {

    @GetMapping("header")
    public String header(
        @RequestHeader("Accept-Encoding") String headerFormRequest,
        @RequestHeader("myHeader") String myHeader,
        @RequestHeader("User-Agent") String userAgent
    ){
       // System.out.println(headerFormRequest);
        return myHeader;
    }

    @GetMapping("header2")
    public String Header2(
            @RequestHeader Map<String, String> header
            ){
        return header.get("User-Agent").toLowerCase();
    }
}
