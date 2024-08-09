package com.example.arrays_strings;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class ClosestNumberToZero {
    public CompletableFuture<Integer> findClosestNumber(int[] nums){

        return CompletableFuture.supplyAsync(() -> {
            List<Integer> integerList = Arrays.stream(nums)
                    .boxed()
                    .sorted((a, b) -> Integer.compare(Math.abs(a), Math.abs(b)))
                    .distinct()
                    .toList();
            return integerList.isEmpty()?
                                null:
                                integerList.size() == 1?
                                    integerList.get(0):
                                    Math.abs(integerList.get(0)) == Math.abs(integerList.get(1))?
                                        Math.max(integerList.get(0), integerList.get(1)):
                                        integerList.get(0);
        });
    }
}
