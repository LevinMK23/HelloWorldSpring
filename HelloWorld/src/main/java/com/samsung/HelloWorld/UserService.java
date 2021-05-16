package com.samsung.HelloWorld;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(int id) {
        return new User(id, 15, "Ivanov", "Ivan");
    }

}
