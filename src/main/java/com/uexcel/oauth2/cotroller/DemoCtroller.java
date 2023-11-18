package com.uexcel.oauth2.cotroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/secureEndpoint")
public class DemoCtroller {

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("This is secure endpoint");
    }

}
