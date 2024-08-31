package com.example;

import com.example.arrays_strings.*;
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
        LongestCommonPrefix sol = new LongestCommonPrefix();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
