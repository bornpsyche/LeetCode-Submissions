class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) 
                ans.add(i+1);
        }
        return ans;
    }
    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i]-1;
            if(arr[correct] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}