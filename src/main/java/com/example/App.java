package com.example;

import com.example.arrays_strings.ClosestNumberToZero;

import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        int[] nums3 = {100000,-100000};
        ClosestNumberToZero closestNumberToZero = new ClosestNumberToZero();
        System.out.println(closestNumberToZero.findClosestNumber(nums3).get());
    }
}
