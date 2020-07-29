package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    Integer filed;

    public String testService(String input) {
        String output = "output something";
        return output;
    }

    public String testPrivateService(String input) {
        return testPri(input);
    }

    private String testPri(String input) {
        filed = 1;
        String output = "output something private";
        return output;
    }
}
