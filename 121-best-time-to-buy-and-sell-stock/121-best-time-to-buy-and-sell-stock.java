class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int prof = max - min;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
            if(prices[i] > max) max = prices[i];
            prof = Math.max(prof,max - min);
        }
        return prof;
    }
}