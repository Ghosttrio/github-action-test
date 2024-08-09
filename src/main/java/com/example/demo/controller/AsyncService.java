package com.example.demo.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    public void execute() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Async
    public void execute2() throws InterruptedException {
        Thread.sleep(1000);
    }
}
