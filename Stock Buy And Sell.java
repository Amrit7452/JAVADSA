class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minvalue=prices[0];
        int maxvalue=0;
        if(prices== null||n<2){
            return 0;
        }
        for(int i=0;i<n;i++){
            int price=prices[i];
            if(price<minvalue){
                minvalue=price;
            }
            else if((price-minvalue)>maxvalue){
                maxvalue=price-minvalue;
            }
        }
        return maxvalue;
        
    }
}