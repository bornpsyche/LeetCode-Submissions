class Solution {
    public boolean isPowerOfTwo(int n) {
        int flag=0;
        if(n<=0) return false;
        while(n!=1){
            if((n%2)!=0) {
                flag++;
                break;
            }
            n/=2;
        }
        return(flag==0);
    }
}