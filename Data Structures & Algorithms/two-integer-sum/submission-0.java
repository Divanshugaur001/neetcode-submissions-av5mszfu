class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int ans[]= new int [2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<n;i++){
            int comp= target-nums[i];
            if(h.containsKey(comp)){
                ans[0]=i;
                ans[1]=h.get(comp);
                Arrays.sort(ans);
                return ans;
            }
             h.put(nums[i],i);
        }
       
        return ( new int[]{-1,-1});
    }
}
