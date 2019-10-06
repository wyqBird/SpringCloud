package com.wyq.web.controller;

import com.wyq.web.async.AsyncTest;
import com.wyq.web.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yongqian Wang
 * @version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private AsyncTest asyncTest;

    @Autowired
    private MyConfig myConfig;

    /**
     * 注入配置
     */
    @Value("${server.port}")
    private String port;

    @Autowired
    private Environment env;

    @GetMapping("/hello5")
    public String hello5() {
        asyncTest.saveLog();
        return "execute async...";
    }

    @GetMapping("/hello4")
    public String hello4() {
        return myConfig.getName();
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "当前端口是： " + port;
    }

    @GetMapping("/hello2")
    public String hello2() {
        // 读取配置
        String port = env.getProperty("server.port");
        return port;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
