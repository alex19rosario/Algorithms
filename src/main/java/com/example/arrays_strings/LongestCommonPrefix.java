package com.example.arrays_strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);  // Step 1: Sort the array of strings
        String first = strs[0];  // Step 2: Get the first string after sorting
        String last = strs[strs.length-1];  // Step 3: Get the last string after sorting
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {  // Step 4: Compare characters of first and last strings
            if (first.charAt(i) != last.charAt(i)) {  // Step 5: If characters differ, stop
                return ans.toString();
            }
            ans.append(first.charAt(i));  // Step 6: Append matching characters to the result
        }
        return ans.toString();  // Step 7: Return the result
    }
}
