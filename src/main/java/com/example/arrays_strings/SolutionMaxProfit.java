package com.example.arrays_strings;

public class SolutionMaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min)
                min = prices[i];
            else if(prices[i] - min > maxProfit)
                maxProfit = prices[i] - min;
        }
        return maxProfit;
    }
}
