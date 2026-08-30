class Solution {
    public int reverse(int x) {
        int org = x;
        int rem = 0;
        int rev = 0;
        while(x!=0){
            rem = x%10;
            x = x/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && rem >7) || rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE/10 && rem < -8)){
                return 0;
            }
            rev = rem + (rev*10);
        }
        return rev;
    }
}