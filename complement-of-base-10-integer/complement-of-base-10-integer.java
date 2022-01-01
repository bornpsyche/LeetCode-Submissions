class Solution {
    public int bitwiseComplement(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        int x = n, c=0;
        while(x!=0){
            x=x>>1;
            c++;
        }
        x= (int)(Math.pow(2,c)-1);
        return((~n)&x);
    }
}