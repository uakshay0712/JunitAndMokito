package com.mavenProject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class SortingDisplayNameTest {

    @Test
    @DisplayName("This is Yams")
    public void test2(){
        System.out.println("This is test2");
    }

    @Test
    @DisplayName("This is Akshay")
    public void test3(){
        System.out.println("This is test3");
    }

    @Test
    @DisplayName("This is Running")
    public void test1(){
        System.out.println("This is test1");
    }
}
