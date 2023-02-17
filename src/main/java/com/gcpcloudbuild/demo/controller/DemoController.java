package com.gcpcloudbuild.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/{name}")
    public ResponseEntity<String> sayHi(@PathVariable  String name) {
        String result = "Hi "+ name ;
        return  ResponseEntity.ok(result);

    }

}