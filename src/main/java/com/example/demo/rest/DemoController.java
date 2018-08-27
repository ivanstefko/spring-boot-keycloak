
package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    private String test;

        @GetMapping("/rest")
        public Map<String, String> index() {
            Map<String, String> index = new HashMap<>();
            index.put("app", "Spring Boot with KeyCloak authentication");
            index.put("version", "1.0");

        return index;
    }
}
