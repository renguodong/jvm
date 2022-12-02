package com.learn.jvm.demo.basicsDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Slf4j
public class FutureTaskTest {

    @Async
    public Future<String> taskOne() {
        log.info("任务1线程名称 = {}", Thread.currentThread().getName());
        //执行内容同上，省略
        return new AsyncResult<>("1完成");
    }

    @Async
    public Future<String> taskTwo() {
        log.info("任务1线程名称 = {}", Thread.currentThread().getName());
        //执行内容同上，省略
        return new AsyncResult<>("2完成");
    }

    @Async
    public Future<String> taskThere() {
        log.info("任务1线程名称 = {}", Thread.currentThread().getName());
        //执行内容同上，省略
        return new AsyncResult<>("执行任务3完成");
    }
}