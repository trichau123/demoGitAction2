package com.demo.demogitaction2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoGitAction2Application {

    @GetMapping("/welcome")
    public String welcome(){
        return "Hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoGitAction2Application.class, args);
    }

}
