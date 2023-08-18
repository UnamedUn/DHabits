public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        int iBuy = 0; // index when buying
        int buyPrice = prices[0];
        for (int i = 0; i < len; i++) {
            if (buyPrice > prices[i]) {
                iBuy = i;
                buyPrice = prices[i];
            }
            int currProfit = prices[i] - buyPrice;
            if (currProfit > profit) {
                profit = currProfit;
            }
        }
        return profit;
    }
}
