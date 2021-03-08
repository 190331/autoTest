package com.course.testng.groups;

import org.testng.annotations.Test;
@Test(groups = "student")
public class gourpsOnClass1 {
    public void student1(){
        System.out.println("gourpsOnClass1中的student1运行啦");
    }
    public void student2(){
        System.out.println("gourpsOnClass1中的student2运行啦");
    }
}
