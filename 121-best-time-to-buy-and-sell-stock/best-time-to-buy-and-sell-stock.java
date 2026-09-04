class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
         int mp=0;
         int bp = prices[0];
         for(int i=1;i<n;i++){
            bp=Math.min(bp, prices[i]);
            int profit = prices[i] - bp;
            mp = Math.max(mp, profit);           
        }
        return mp ;       
    }
}