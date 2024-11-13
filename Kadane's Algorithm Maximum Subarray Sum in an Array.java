class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int num:nums){
            currentsum+=num;
            maxsum=Math.max(maxsum,currentsum);

            if(currentsum<0)
            currentsum=0;


        }
        return maxsum;
        
    }
}