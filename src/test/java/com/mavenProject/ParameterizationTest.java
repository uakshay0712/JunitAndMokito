package com.mavenProject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizationTest {

    @ParameterizedTest
    @CsvSource(value = {"Akshay, 32","Yams,25", "Sus, 25"
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void test(String name, int age){
        System.out.println("Emp name"+" "+name);
        System.out.println("Emp age"+" "+ age);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv")
    public void csvFileSource(String name, int age){
        System.out.println("Emp name"+" "+name);
        System.out.println("Emp age"+" "+ age);
    }

}
