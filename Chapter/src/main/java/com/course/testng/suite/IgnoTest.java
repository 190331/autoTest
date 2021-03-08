package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoTest {
    @Test
    public void IgnoTest1(){
        System.out.println("IgnoTest1执行啦");
    }
    @Test(enabled = false)
    public void IgnoTest2(){
        System.out.println("IgnoTest2执行啦");
    }
}
