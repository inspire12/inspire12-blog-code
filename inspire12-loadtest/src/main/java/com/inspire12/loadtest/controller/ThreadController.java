package com.inspire12.loadtest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ThreadController {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadController.class);

    @GetMapping("/name")
    public String doSomething() {
        LOG.info("hey, I'm doing something");

        return Thread.currentThread().toString();
    }

    @GetMapping("/thread/name")
    public String getThreadName() {
        LOG.info("hey, I'm doing something");

        return Thread.currentThread().toString();
    }


}
