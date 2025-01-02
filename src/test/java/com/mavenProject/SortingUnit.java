package com.mavenProject;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SortingUnit {

    @Test
    public void banana(){
        System.out.println("This is test2");
    }

    @Test
    public void apple(){
        System.out.println("This is test3");
    }

    @Test
    public void grapes(){
        System.out.println("This is test1");
    }
}
