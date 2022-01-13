class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //int[] target = new int[nums.length];
        List<Integer> target = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            target.add(index[i],nums[i]);
        }
        int[] array = new int[target.size()];
        for(int i = 0; i < target.size(); i++) array[i] = target.get(i);
        return array;
    }
}