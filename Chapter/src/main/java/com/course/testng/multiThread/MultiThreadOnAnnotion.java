package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
/**
 * testng的多线程
 * invocationCount 为调用次数  threadPoolSize为线程池
 * */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println("输出1");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
