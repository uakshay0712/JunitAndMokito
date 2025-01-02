package com.mavenProject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class UnitTest {

    @BeforeEach
    public void beforEach(){
        System.out.println("This is BeforeEach");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("This is before all test");
    }

    @Test
    public void test1(){
        System.out.println("This is Test1");
    }

    @Test
    public void test2(){
        System.out.println("This is test2");
    }
    @Test
    public void test3(){
        System.out.println("This is test3");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This is after all Test");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("This is after Test");
    }

}
