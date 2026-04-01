class Solution {
    public int maxSubArray(int[] nums) {
         int currsum=0;
        int maxsum=nums[0];

        for(int i=0;i<nums.length;i++){
           
            if(currsum<0){
                currsum=0;
            }
             currsum=nums[i]+currsum;
            if(maxsum<currsum){
                maxsum=currsum;            }
        }
        return maxsum;
    }
}
