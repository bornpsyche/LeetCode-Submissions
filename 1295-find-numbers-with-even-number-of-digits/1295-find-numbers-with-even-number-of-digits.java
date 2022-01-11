class Solution {
    public int findNumbers(int[] nums) {
        int out = 0;
        for(int x : nums) {
            int cnt = (int)Math.log10(x) + 1;
            // while(x!=0) {
            //     x /= 10;
            //     cnt++;
            // }
            if(cnt % 2 == 0) out++;
        }
        return out;
    }
}