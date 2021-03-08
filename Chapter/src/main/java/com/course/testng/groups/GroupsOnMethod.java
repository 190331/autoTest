package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void Servertest1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "client")
    public void Clienttest1(){
        System.out.println("这是客户端组的测试方法1");
    }
    @Test(groups = "client")
    public void Clienttest2(){
        System.out.println("这是客户端组的测试方法2");
    }
    @BeforeGroups("server")
    public void BeforeGroupsOnMethod(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void AfterGroupsOnMethod(){
        System.out.println("这是服务端组运行之后运行的方法!!!");
    }
}
