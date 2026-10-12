class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1; int ans = -1;
        while(n > 0){
            int lst = n%10;
            product *= lst;
            sum += lst;
            n /= 10;
            ans = product - sum;
        }return ans;
    }
}