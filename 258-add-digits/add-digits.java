class Solution {
    public int addDigits(int num) {
        int res = (num == 0) ? 0 : ((num-1)%9)+1;
        return res;
    }
}