package com.mavenProject;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class Assumptions {

    protected int addNumber(int a, int b){
        return a+b;
    }

    @Test
    public void testAddition(){
        int n1=5;
        int n2=7;

        assumingThat(n1>0 && n2>0,()->{
            System.out.println("Assumption Correct");
            int sum= addNumber(n1,n2);
            assertEquals(12,sum);
        });
    }

    @Test
    public void testAddition1(){
        int n1=0;
        int n2=7;
        assumeFalse(n1>0 && n2>0);
        System.out.println("Its Correct");
        int sum=addNumber(n1,n2);
        assertEquals(7,sum);
    }

    @Test
    public void testAddition2(){
        int n1=5;
        int n2=0;
        assumeFalse(n1>5 && n2>0);
        System.out.println("Assumption is correct");
        int sum= addNumber(n1,n2);
        assertEquals(5,sum);
    }
}
