package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest这是在标签执行之前运行的");
    }
    @AfterClass
    public void AfterTest(){
        System.out.println("AfterTest这是在标签执行之后运行的");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在方法执行之前运行的");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在方法执行之后运行的");
    }
    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("BeforeGroups这是在组执行之前运行的");
    }
    @AfterGroups
    public void AfterGroups(){
        System.out.println("AfterGroups这是在组执行之后运行的");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是在套件执行之前运行的");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是在套件执行之后运行的");
    }

}
