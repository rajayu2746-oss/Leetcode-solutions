class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            int n = 0;
            int crnt = nums[i];
              while(crnt > 0){
                crnt = crnt / 10;
                n++;
              } if(n % 2 == 0){
                count++;
              }
        } return count;
    }
}