package com.example.arrays_strings;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;


public class ClosestNumberToZero {
    public CompletableFuture<Integer> findClosestNumber(int[] nums){

        return CompletableFuture.supplyAsync(() -> {
            return Arrays.stream(nums)
                    .parallel()
                    .boxed()
                    .reduce((a, b) -> switch (Integer.compare(Math.abs(a), Math.abs(b))) {
                        case -1 -> a;
                        case 1 -> b;
                        default -> Math.max(a, b);
                    })
                    .orElse(0); // Return 0 if the stream is empty
        });
    }
}
