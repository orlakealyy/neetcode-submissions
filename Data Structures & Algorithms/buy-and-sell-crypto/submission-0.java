class Solution {
    public int maxProfit(int[] prices) {
        int currentMaxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - buyPrice > currentMaxProfit) {
                    currentMaxProfit = prices[j] - buyPrice;
                }
            }
        }

        return currentMaxProfit;
    }
}
