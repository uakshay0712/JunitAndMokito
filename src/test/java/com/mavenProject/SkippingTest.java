package com.mavenProject;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SkippingTest {

    @Disabled
    @Test
    public void test2(){
        System.out.println("This is test2");
    }

    @Test
    public void test3(){
        System.out.println("This is test3");
    }

    @Test
    public void test1(){
        System.out.println("This is test1");
    }
}
