package com.samsung.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/helloWorld")
    public String getMessage(
            @RequestParam(value = "name", defaultValue = "world") String name) {
        return helloWorldService.getMessageFor(name);
    }
}
