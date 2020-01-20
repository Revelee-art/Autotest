package com.course.testng;

import org.testng.annotations.Test;


//依赖测试
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
//被依赖的方法执行失败了后面就不会执行了