package com.example;

import com.example.arrays_strings.ClosestNumberToZero;
import com.example.arrays_strings.DistinctWays;
import com.example.arrays_strings.MergeString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

public class ArraysStringsTests {
    @Test
    void findClosestNumberToZeroTest() throws ExecutionException, InterruptedException {
        int[] nums1 = {-4, -2, 1, 4, 8};
        int[] nums2 = {-2, -1, 1};
        int[] nums3 = {100000,-100000};
        int[] nums4 = {0};
        int[] nums5 = {};
        int[] nums6 = {-1, -1, 1};
        ClosestNumberToZero closestNumberToZero = new ClosestNumberToZero();
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums1).get());
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums2).get());
        Assertions.assertEquals(100000, closestNumberToZero.findClosestNumber(nums3).get());
        Assertions.assertEquals(0, closestNumberToZero.findClosestNumber(nums4).get());
        Assertions.assertEquals(0, closestNumberToZero.findClosestNumber(nums5).get());
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums6).get());
    }

    @Test
    void numberOfDistinctWaysTest() throws ExecutionException, InterruptedException {
        DistinctWays distinctWays = new DistinctWays();
        Assertions.assertEquals(9L, distinctWays.findNumberOfWays(20, 10, 5).get());
        Assertions.assertEquals(1L, distinctWays.findNumberOfWays(5, 10, 10).get());
    }

    @Test
    void mergeStringAlternatelyTest() throws ExecutionException, InterruptedException {
        MergeString mergeString = new MergeString();
        Assertions.assertEquals("apbqcr", mergeString.mergeAlternately("abc", "pqr").get());
        Assertions.assertEquals("apbqrs", mergeString.mergeAlternately("ab", "pqrs").get());
        Assertions.assertEquals("apbqcd", mergeString.mergeAlternately("abcd", "pq").get());
    }
}
