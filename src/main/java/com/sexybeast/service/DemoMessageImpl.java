package com.sexybeast.service;

import org.springframework.stereotype.Service;

@Service
public class DemoMessageImpl implements DemoMessage {

    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this demo application";
    }
}
