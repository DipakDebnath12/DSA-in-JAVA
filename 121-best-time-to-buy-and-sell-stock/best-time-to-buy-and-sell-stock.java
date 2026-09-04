class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mp=0;
        int bp = Integer.MAX_VALUE;
         //int bp = prices[0];
        for(int i=0;i<n;i++){
            //bp=Math.min(bp, prices[i]);
            if(bp<prices[i]){
            int profit = prices[i] - bp;
            mp = Math.max(mp, profit);  
            }else{
                bp= prices[i];
            }         
        }
        return mp ;       
    }
}