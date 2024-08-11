package com.example;

import com.example.arrays_strings.ClosestNumberToZero;
import com.example.arrays_strings.MergeString;
import com.example.arrays_strings.romans.InvalidRomanException;
import com.example.arrays_strings.romans.RomanToInteger;
import com.example.arrays_strings.romans.RomanValidator;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        RomanToInteger romanToInteger = new RomanToInteger(new RomanValidator());
        try {
            System.out.println(romanToInteger.romanToInt("s"));
        } catch (InvalidRomanException e) {
            System.out.println(e.getMessage());
        }
    }
}
