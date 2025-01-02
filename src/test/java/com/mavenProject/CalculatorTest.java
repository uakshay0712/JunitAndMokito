package com.mavenProject;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        assertEquals(6, Calculator.add(2,4));
    }

    @Test
    public void testSub(){
        assertEquals(4, Calculator.sub(10,6));
    }

    @Test
    public void testMul(){
        assertEquals(4, Calculator.mul(2,2));
    }

    @Test
    public void testDiv(){
        assertEquals(4, Calculator.div(8,2));
    }

}
