class Solution {
    public int maxProfit(int[] prices) {
        int  buyprice=prices[0];
        int  maxprofit=0;
        for(int num:prices){
            if(buyprice<num){
                int profit=num-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=num;
            }
        }
        return maxprofit;
    }
}
