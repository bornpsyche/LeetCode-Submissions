class Solution {
    public boolean isPowerOfTwo(int n) {
        int flag=0;
        if(n<=0) return false;
        while(n!=0){
            if((n&1)==1) flag++;
            n=n>>1;
        }
        if(flag==1) return true;
        else return false;
    }
}