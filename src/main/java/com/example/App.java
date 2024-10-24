package com.example;

import com.example.arrays_strings.*;
import com.example.arrays_strings.romans.InvalidRomanException;
import com.example.arrays_strings.romans.RomanToInteger;
import com.example.arrays_strings.romans.RomanValidator;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SummaryRanges sr = new SummaryRanges();
        //System.out.println(sr.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(sr.summaryRanges(new int[]{-5}));
    }
}
