class Solution {
    public boolean isPalindrome(int x) {
    int n,rev=0;int r;
    if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
    n=x;
    while(n!=0){
        if( rev<Integer.MIN_VALUE/10||rev>Integer.MAX_VALUE/10) return false;
        rev=rev*10+n%10;
        n=n/10;   
        }
    if(rev==x) return true;
    else return false;
    }
    }