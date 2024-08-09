package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MemberRepository memberRepository;
    private final AsyncService asyncService;

    public HelloController(MemberRepository memberRepository, AsyncService asyncService) {
        this.memberRepository = memberRepository;
        this.asyncService = asyncService;
    }

    @GetMapping
    public String hello() throws InterruptedException {
        asyncService.execute();
        asyncService.execute();
        asyncService.execute();
        asyncService.execute();
        asyncService.execute();
        return "hello";
    }

    @GetMapping("/test")
    public String hello2() throws InterruptedException {
        asyncService.execute2();
        asyncService.execute2();
        asyncService.execute2();
        asyncService.execute2();
        asyncService.execute2();
        return "hello";
    }





}

