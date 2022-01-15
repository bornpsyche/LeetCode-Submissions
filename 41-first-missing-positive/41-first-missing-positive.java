class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i]-1;
            if(correct < nums.length && correct >= 0 && nums[correct]!=nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        int k = 0;
        for(k = 0; k < nums.length; k++) {
            if(nums[k]!=k+1 ) {
                //if()
                return k+1;
            }
        }
        return nums.length+1;
    }
}