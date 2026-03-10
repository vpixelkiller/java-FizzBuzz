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

    @Test
    public void should_return_a_string_with_numbers_from_1_to_100()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100";

        String response = fizzBuzz.getList();

        assertEquals( expectedResult, response);
    }


}
