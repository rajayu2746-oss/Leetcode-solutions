class Solution {
    public boolean judgeSquareSum(int c) {
        long left =0 ;
      int right= (int)Math.sqrt(c);
      
      while(left <= right){
        long right1 = right*right;
        long left1 = left*left;
        long sum = right1 + left1;
        if(sum == c )return true;
        else if(sum > c){
            right--;
        }else{
            left++;
        }

        }return false;
      }
    }
