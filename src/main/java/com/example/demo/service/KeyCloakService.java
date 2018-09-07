package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class KeyCloakService {

    public Map<String, String> getRealmData1() {
        Map<String, String> index = new HashMap<>();
        index.put("app", "Spring Boot with KeyCloak authentication");
        index.put("version", "1.0");
        index.put("realm", "realm1");

        return index;
    }

    public Map<String, String> getRealmData2() {
        Map<String, String> index = new HashMap<>();
        index.put("app", "Spring Boot with KeyCloak authentication");
        index.put("version", "2.0");
        index.put("realm", "realm2");

        return index;
    }
}
