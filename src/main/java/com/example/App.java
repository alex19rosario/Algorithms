package com.example;

import com.example.arrays_strings.ClosestNumberToZero;
import com.example.arrays_strings.MergeString;

import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        MergeString mergeString = new MergeString();
        System.out.println(mergeString.mergeAlternately("abc", "pqr"));
    }
}
