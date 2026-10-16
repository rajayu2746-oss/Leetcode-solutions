class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []res = new int[n];
        int i = n - 1;
        int st = 0;
        int lst = n - 1;
        while(st <= lst){
            int leftsqr = nums[st] * nums[st];
            int rightsqr = nums[lst] * nums[lst];
            if(leftsqr >= rightsqr){
                res[i] = leftsqr;
                st++; i--;
            }else{
                res[i] = rightsqr;
                lst--;
                i--;
            }
        } return res;
    }
}