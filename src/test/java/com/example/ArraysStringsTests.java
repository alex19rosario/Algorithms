package com.example;

import com.example.arrays_strings.*;
import com.example.arrays_strings.romans.InvalidRomanException;
import com.example.arrays_strings.romans.RomanToInteger;
import com.example.arrays_strings.romans.RomanValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;


import static org.junit.jupiter.api.Assertions.*;

public class ArraysStringsTests {
    @Test
    void findClosestNumberToZeroTest() {
        int[] nums1 = {-4, -2, 1, 4, 8};
        int[] nums2 = {-2, -1, 1};
        int[] nums3 = {100000,-100000};
        int[] nums4 = {0};
        int[] nums5 = {};
        int[] nums6 = {-1, -1, 1};
        ClosestNumberToZero closestNumberToZero = new ClosestNumberToZero();
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums1));
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums2));
        Assertions.assertEquals(100000, closestNumberToZero.findClosestNumber(nums3));
        Assertions.assertEquals(0, closestNumberToZero.findClosestNumber(nums4));
        Assertions.assertEquals(0, closestNumberToZero.findClosestNumber(nums5));
        Assertions.assertEquals(1, closestNumberToZero.findClosestNumber(nums6));
    }

    @Test
    void numberOfDistinctWaysTest() {
        DistinctWays distinctWays = new DistinctWays();
        Assertions.assertEquals(9L, distinctWays.findNumberOfWays(20, 10, 5));
        Assertions.assertEquals(1L, distinctWays.findNumberOfWays(5, 10, 10));
    }

    @Test
    void mergeStringAlternatelyTest() {
        MergeString mergeString = new MergeString();
        Assertions.assertEquals("apbqcr", mergeString.mergeAlternately("abc", "pqr"));
        Assertions.assertEquals("apbqrs", mergeString.mergeAlternately("ab", "pqrs"));
        Assertions.assertEquals("apbqcd", mergeString.mergeAlternately("abcd", "pq"));
    }

    @Test
    void romanToIntegerTest() throws InvalidRomanException {
        RomanToInteger romanToInteger = new RomanToInteger(new RomanValidator());
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MCMXCIVMCMXCIVXX", "XVS", "IIIIMMMM"})
    void isValidRomanTest(String roman){
        RomanValidator romanValidator = new RomanValidator();
        romanValidator.isValidRoman(roman);
    }

    @Test
    void InvalidRomanExceptionTest() {
        RomanToInteger romanToInteger = new RomanToInteger(new RomanValidator());
        Exception exception = assertThrows(InvalidRomanException.class, () -> romanToInteger.romanToInt("S"));
        assertEquals("Invalid Roman Number", exception.getMessage());
    }

    @Test
    void romanToIntDurationTest() {
        RomanToInteger romanToInteger = new RomanToInteger(new RomanValidator());
        int ms =assertTimeout(Duration.ofMillis(5), () -> romanToInteger.romanToInt("MMMCMXLIV"));
    }

    @Test
    void isSubsequenceTest() {
        Subsequence subsequence = new Subsequence();
        Assertions.assertTrue(subsequence.isSubsequence("", "xyz"));
        Assertions.assertTrue(subsequence.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(subsequence.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void maxProfitTest(){
        SolutionMaxProfit solutionMaxProfif = new SolutionMaxProfit();
        Assertions.assertEquals(5, solutionMaxProfif.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(0, solutionMaxProfif.maxProfit(new int[]{7,6,4,3,1}));
        Assertions.assertEquals(2, solutionMaxProfif.maxProfit(new int[]{2,1,2,1,0,1,2}));
        Assertions.assertEquals(4, solutionMaxProfif.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    void longestCommonPrefixTest(){
        LongestCommonPrefix solution = new LongestCommonPrefix();
        Assertions.assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assertions.assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assertions.assertEquals("", solution.longestCommonPrefix(new String[]{"dog",""}));
    }

}
