class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int  j =0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) ans[i] = nums[i/2];
            else {
                ans[i] = nums[(nums.length/2) + j];
                j++;    
            }
        }
        return ans;
    }
}