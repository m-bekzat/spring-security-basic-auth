package kz.bekzat.workspace.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    @GetMapping("/public/hello")
    public String greeting() {
        return "Hello, you are not authenticated!";
    }

    @GetMapping("/private/hello")
    public String signIn() {
        return "Hello, you are authenticated!";
    }
}
