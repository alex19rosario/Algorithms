package com.example.arrays_strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int start = nums[0]; // Start of the current range

        for (int i = 1; i < nums.length; i++) {
            // Check if there's a gap between the current number and the previous one
            if (nums[i] != nums[i - 1] + 1) {
                // Add the current range to the result
                result.add(formatRange(start, nums[i - 1]));
                // Update start to the new range
                start = nums[i];
            }
        }

        // Add the final range
        result.add(formatRange(start, nums[nums.length - 1]));

        return result;
    }

    // Helper method to format the range as either "start->end" or "start" if there's no range
    private String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start); // Single number, not a range
        } else {
            return start + "->" + end; // Range with start and end
        }
    }
}
