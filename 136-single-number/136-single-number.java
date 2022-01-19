class Solution {
    public int singleNumber(int[] nums) {
        int nonRepeating = 0;
        for(int n : nums) nonRepeating ^= n;
        return nonRepeating;
    }
}