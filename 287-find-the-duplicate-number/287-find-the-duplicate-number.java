class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);
        return nums[nums.length-1];
    }
    void sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}