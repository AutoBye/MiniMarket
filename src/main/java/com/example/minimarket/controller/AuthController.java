package com.example.minimarket.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {
    @PostMapping ("/login")
    public Map<String, String> test1() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "백엔드와의 연동 성공!");
        return response;
    }

    @PostMapping ("/signup")
    public Map<String, String> test2() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "백엔드와의 연동 성공!");
        return response;
    }


}
