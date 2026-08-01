class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        else{
            int old=x, reversed = 0;

            while(x!=0){
                reversed = reversed *10 + x % 10;
                x=x/10;
            }
            return old == reversed;
        }
    }
    
}