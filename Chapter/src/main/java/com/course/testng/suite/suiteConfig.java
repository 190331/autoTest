package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    ///套件执行之前的准备工作
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite运行啦");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite运行啦");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest运行啦");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest运行啦");
    }
}
