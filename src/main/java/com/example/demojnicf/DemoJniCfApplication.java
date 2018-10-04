package com.example.demojnicf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import square.Square;

@SpringBootApplication
@RestController
public class DemoJniCfApplication {

    @GetMapping("/")
    public String hello() {
        return "square(4)=" + Square.square(4);
    }

    public static void main(String[] args) {
        System.loadLibrary("square");
        SpringApplication.run(DemoJniCfApplication.class, args);
    }
}
