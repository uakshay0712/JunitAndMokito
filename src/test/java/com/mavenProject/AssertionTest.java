package com.mavenProject;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AssertionTest {

    @Test
    public void standardAssertion(){
        String expectedValue= "Akshay";
        String actualValue="Akshay";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void groupAssertion(){
        assertAll("Heading",()->assertEquals("One", "One"),
                ()->assertEquals("Two", "Two"));
    }

    @Test
    public void checkingNull(){
        String value= "Akshay";
        assertNotNull(value);
    }
}
