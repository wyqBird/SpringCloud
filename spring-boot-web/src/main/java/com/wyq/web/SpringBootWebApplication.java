package com.wyq.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) {
        // 启动参数设置，比如自动生成端口
        new StartCommand(args);
        SpringApplication.run(SpringBootWebApplication.class, args);
    }


}
