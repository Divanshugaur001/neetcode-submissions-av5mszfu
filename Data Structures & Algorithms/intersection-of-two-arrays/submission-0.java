class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>h= new HashSet<>();
        for(int nums : nums1){
            h.add(nums);
        }
         List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                res.add(nums2[i]);
                 h.remove(nums2[i]);
            }
        }
        int arr[]= new int[res.size()];
        for(int i=0;i<arr.length; i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}