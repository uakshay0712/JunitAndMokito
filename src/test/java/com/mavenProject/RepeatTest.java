package com.mavenProject;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatTest {

    @RepeatedTest(value = 2, name = "Akshay - Repeat{currentRepetition} of {totalRepititions}")
    public void printNumber(){
        System.out.println("Uppala");
    }
}
