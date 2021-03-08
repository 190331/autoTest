package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {
    /***
     * 异常测试
     * 适用于在我们期望结果是某一个异常时
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
