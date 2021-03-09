package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMterTest {

    @Test
    @Parameters({"name","age"})
    public void test1(String name,int age){
        System.out.println("名字是"+name+"; 年龄是"+age);
    }
}
