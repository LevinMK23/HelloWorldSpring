package com.samsung.HelloWorld;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getMessageFor(String msg) {
        return "Hello " + msg;
    }

}
