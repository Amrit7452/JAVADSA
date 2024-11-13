class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot=n-2;
        while(pivot >=0 && nums[pivot] >=nums[pivot+1]){
            pivot--;
        }
        if(pivot>=0){
            int swap_index=n-1;
            while(nums[swap_index]<=nums[pivot]){
                swap_index--;
            }

            swap(nums,pivot,swap_index);
            reverse(nums,pivot+1,n-1);
        }
        else{
            reverse(nums,0,n-1);
        }
    }



    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }




    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }


    }
}






            

        



        
        
    
