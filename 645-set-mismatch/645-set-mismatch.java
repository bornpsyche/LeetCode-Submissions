class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for(int k = 0; k < nums.length; k++) {
            if(nums[k] != k+1) {
                return new int[] {nums[k], k+1};
            }
        }
        return new int[]{-1,-1};
    }
}