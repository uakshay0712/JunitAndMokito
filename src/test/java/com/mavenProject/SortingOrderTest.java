package com.mavenProject;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortingOrderTest {


    @Test
    @Order(3)
    public void test2(){
        System.out.println("This is test2");
    }

    @Test
    @Order(1)
    public void test3(){
        System.out.println("This is test3");
    }

    @Test
    @Order(2)
    public void test1(){
        System.out.println("This is test1");
    }
}
