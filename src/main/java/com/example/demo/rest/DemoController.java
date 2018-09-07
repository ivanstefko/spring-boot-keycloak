package com.example.demo.rest;

import com.example.demo.service.KeyCloakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    KeyCloakService service;

    @GetMapping("/realm/1")
    public Map<String, String> realm1() {
        return service.getRealmData1();
    }

    @GetMapping("/realm/2")
    public Map<String, String> realm2() {
        return service.getRealmData2();
    }

}
