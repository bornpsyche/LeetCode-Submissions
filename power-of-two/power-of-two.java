class Solution {
    public boolean isPowerOfTwo(int n) {
        int flag=0;
        if(n<=0) return false;
        while(n!=0){
            if((n&1)==1) flag++;
            if(flag == 2) break;
            n=n>>1;
        }
         return flag==1;
    }
}