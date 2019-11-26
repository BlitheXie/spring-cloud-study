package com.blithe.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author: xieyongning
 * @Date: 2019/11/25 23:30
 * @Version 1.0
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${neo.hello:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> hello(){
        return Mono.justOrEmpty(profile);
    }
}
