package com.example.demo.controller;

import com.example.demo.data.RequestData;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@Slf4j
public class ReturnController {

    @Autowired
    TestService service;

    @GetMapping("/test/{id}")
    public ResponseEntity<String> method(@PathVariable String id) throws Exception{
//        log.info("method starts id: {}", id);
        RequestData request = RequestData.valueOf(id);
//        if (!containEle(request)) {
//            return new ResponseEntity<>("bad request, plz check the url", HttpStatus.BAD_REQUEST);
//        }
        return new ResponseEntity<>("Hello World!", HttpStatus.resolve(request.status()));
    }

    @GetMapping("/arthas/test")
    public String testArthas() {
       return service.testService("inputSomething");
    }

    @GetMapping("/arthas/testPrivate")
    public String testArthasPri() {
       return service.testPrivateService("inputSomethingPrivate");
    }

    public boolean containEle(RequestData request) {

        for (RequestData ele : RequestData.values()) {
            if (ele.equals(request)) {
                return true;
            }
        }
        return false;
    }

}
