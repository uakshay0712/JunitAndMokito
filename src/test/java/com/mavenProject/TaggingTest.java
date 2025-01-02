package com.mavenProject;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggingTest {

//    @Test
//    @Tag("Smoking Test")
//    public void test(){ System.out.println("Smoke Test1"); }
//
//    @Test
//    @Tag("Smoke Test")
//    public void test1(){ System.out.println("Sanity Test"); }
//
//    @Test
//    @Tag("Regression Test")
//    public void test2(){ System.out.println("Regression Test"); }

    @Test
    @Tag("SmokeTest")
    public void test(){
        System.out.println("smoke test1");
    }

    @Test
    @Tag("SmokeTest")
    public void test1(){
        System.out.println("Sanity test");
    }

    @Test
    @Tag("RegressionTest")
    //@Disabled
    public void test2(){

        System.out.println("Regression test");
    }
}
