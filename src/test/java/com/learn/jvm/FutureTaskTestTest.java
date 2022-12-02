package com.learn.jvm;

import com.learn.jvm.demo.basicsDemo.FutureTaskTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Slf4j
@SpringBootTest
@EnableAsync
public class FutureTaskTestTest {

    @Resource
    private FutureTaskTest futureTaskTest;

    @Test
    public void runAsync() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> taskOne = futureTaskTest.taskOne();
        Future<String> taskTwo = futureTaskTest.taskTwo();
        Future<String> taskThere = futureTaskTest.taskThere();

        while (true) {
            if (taskOne.isDone() && taskTwo.isDone() && taskThere.isDone()) {
                log.info("任务1返回结果={},任务2返回结果={},任务3返回结果={},", taskOne.get(), taskTwo.get(), taskThere.get());
                break;
            }
        }
        long end = System.currentTimeMillis();
        log.info("总任务执行结束,总耗时={} 毫秒", end - start);
    }

    @Test
    public void testCompletableThenRunAsync() throws Exception {
        long startTime = System.currentTimeMillis();

        CompletableFuture<Void> cp1 = CompletableFuture.runAsync(() -> {
            //任务1
            futureTaskTest.taskOne();
        });
        CompletableFuture<Void> cp2 = CompletableFuture.runAsync(() -> {
            //任务2
            futureTaskTest.taskTwo();
        });
        CompletableFuture<Void> cp3 = CompletableFuture.runAsync(() -> {
            //任务3
            futureTaskTest.taskThere();
        });

        cp1.get();
        cp2.get();
        cp3.get();
        //模拟主程序耗时时间
        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}