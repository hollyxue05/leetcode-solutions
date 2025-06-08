class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; int profit = 0; int minCost = Integer.MAX_VALUE; int maxSell = 0; 

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minCost)     minCost = prices[i]; 

            if(prices[i] > maxSell)    maxSell = prices[i]; 

            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }

        return maxProfit; 
    }
}