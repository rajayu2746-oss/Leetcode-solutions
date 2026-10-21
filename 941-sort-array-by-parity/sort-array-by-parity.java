class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int n = nums.length;
      int even = 0;
      int odd = n - 1;
      while(even < odd){
      if(nums[even] % 2 > nums[odd] % 2){
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
      } 
      if(nums[even] % 2 == 0){
        even ++;
      } if(nums[odd] % 2 == 1){
        odd--;
      }
      } return nums;
}
}
