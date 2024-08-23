package com.example;

import com.example.arrays_strings.ClosestNumberToZero;
import com.example.arrays_strings.MergeString;
import com.example.arrays_strings.SolutionMaxProfit;
import com.example.arrays_strings.Subsequence;
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
        SolutionMaxProfit solutionMaxProfif = new SolutionMaxProfit();
        System.out.println(solutionMaxProfif.maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
}
