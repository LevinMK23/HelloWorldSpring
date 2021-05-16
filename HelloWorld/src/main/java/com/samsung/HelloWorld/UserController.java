package com.samsung.HelloWorld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        log.debug("user received: {}", user);
        System.out.println("user received: " + user);
    }

}
