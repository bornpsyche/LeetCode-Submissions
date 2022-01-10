class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int cnt = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == temp) cnt++;
            }
            list.add(cnt);
        }
        int flag = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 1) flag=i; 
        }
        return nums[flag];
    }
}