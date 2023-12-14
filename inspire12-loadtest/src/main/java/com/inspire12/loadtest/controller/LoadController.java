package com.inspire12.loadtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class LoadController {
    @GetMapping
    public ResponseEntity<Void> load(){
        int i = ThreadLocalRandom.current().nextInt(6);
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
        return ResponseEntity.ok().build();
    }
}
