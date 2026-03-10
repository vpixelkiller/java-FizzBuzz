package com.kata;
import java.util.*;

public class FizzBuzz
{
    private int fizzNumber = 3;
    private int buzzNumber = 5;

    public String check( int number )
    {
        String response = "";

        if (isFizz(number)) response += "Fizz";
        if (isBuzz(number)) response += "Buzz";
        if (isFizzBuzz(number)) response = String.valueOf(number);

        return response;
    }

    private boolean isFizz(int number) {
        return number % fizzNumber == 0;
    }

    private boolean isBuzz(int number) {
        return number % buzzNumber == 0;
    }

    private boolean isFizzBuzz(int number) {
        return number % fizzNumber != 0 && number % buzzNumber != 0;
    }

    public String getList() {
        String listAsString = "";
        int firstListNumber = 1; 
        int lastListNumber = 100;

        for (int count = firstListNumber; count <= lastListNumber; count ++) {

            listAsString += count + " ";
        }

        return listAsString.trim();
    }

    private String chop (String kko) {
        return "";
    }

}
