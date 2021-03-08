package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "Teacher")
public class groupOnClass3 {
    public void teacher1(){
        System.out.println("groupOnClass3中的teacher1运行了");
    }
    public void teacher2(){
        System.out.println("groupOnClass3中的teacher2运行了");
    }
}
