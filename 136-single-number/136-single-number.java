class Solution {
    public int singleNumber(int[] nums) {
        int nonRepeating = 0;
        for(int i = 0; i < nums.length; i++) nonRepeating ^= nums[i];
        return nonRepeating;
    }
}