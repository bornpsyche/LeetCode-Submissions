class Solution {
    public int findNumbers(int[] nums) {
        int out = 0;
        for(int x : nums) {
            int cnt = 0;
            while(x!=0) {
                x /= 10;
                cnt++;
            }
            if(cnt % 2 == 0) out++;
        }
        return out;
    }
}