class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;}
            }
        }
        
        
    }
}