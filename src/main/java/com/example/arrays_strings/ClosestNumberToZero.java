package com.example.arrays_strings;

import java.util.Arrays;


public class ClosestNumberToZero {
    public int findClosestNumber(int[] nums){

        return Arrays.stream(nums)
                .boxed()
                .reduce((a, b) -> switch (Integer.compare(Math.abs(a), Math.abs(b))) {
                    case -1 -> a;
                    case 1 -> b;
                    default -> Math.max(a, b);
                })
                .orElse(0); // Return 0 if the stream is empty
    }
}
