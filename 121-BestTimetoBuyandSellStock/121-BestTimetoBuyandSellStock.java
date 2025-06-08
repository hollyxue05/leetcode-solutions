// Last updated: 6/7/2025, 9:56:26 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int minCost = Integer.MAX_VALUE;  

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minCost)     minCost = prices[i]; 

            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }

        return maxProfit; 
    }
}