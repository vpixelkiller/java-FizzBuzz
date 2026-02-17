package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest 
{
    @Test
    public void shoud_answer_fizz_when_receives_3()
    {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "Fizz";
        int numberUnderTest = 3;

        // Act
        String response = fizzBuzz.check(numberUnderTest);

        // Assert
        assertEquals( expectedResponse, response );
    }

    @Test
    public void shoud_answer_buzz_when_receives_5()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "Buzz";
        int numberUnderTest = 5;

        String response = fizzBuzz.check(numberUnderTest);

        assertEquals( expectedResponse, response );
    }

    @Test
    public void shoud_answer_1_as_string_when_receives_1()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "1";
        int numberUnderTest = 1;

        String response = fizzBuzz.check(numberUnderTest);

        assertEquals( expectedResponse, response );
    }

    @Test
    public void shoud_answer_fizzbuzz_when_receives_15()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "FizzBuzz";
        int numberUnderTest = 15;

        String response = fizzBuzz.check(numberUnderTest);

        assertEquals( expectedResponse, response );
    }

    @Test
    public void shoud_answer_fizz_when_receives_multiple_of_3()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "Fizz";
        int numberUnderTest = 9;

        String response = fizzBuzz.check(numberUnderTest);

        assertEquals( expectedResponse, response );
    }

    @Test
    public void shoud_answer_buzz_when_receives_multiple_of_5()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResponse = "Buzz";
        int numberUnderTest = 10;

        String response = fizzBuzz.check(numberUnderTest);

        assertEquals( expectedResponse, response );
    }



}
