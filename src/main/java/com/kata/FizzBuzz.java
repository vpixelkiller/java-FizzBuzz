package com.kata;

public class FizzBuzz
{
    public String check( int number )
    {
        String response = "";
        int fizzNumber = 3;

        if ( number % 3 == 0 ) response += "Fizz";
        if ( number % 5 == 0 ) response += "Buzz";
        if ( number % 3 != 0 &&  number % 5 != 0  ) response = String.valueOf(number);

        return response;
    }
}
