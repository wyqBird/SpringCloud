package com.wyq.web.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Yongqian Wang
 * @version 1.0
 */
@Component
public class AsyncTest {

    @Async
    public void saveLog() {
        System.err.println(Thread.currentThread().getName());
    }
}
