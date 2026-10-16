class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []temp = new int[n];
        for(int i=0;i<nums.length;i++){
        temp[i] = nums[i] * nums[i];
        }
        Arrays.sort(temp);
       //  System.out.print(Arrays.toString(temp));
       return temp;
    }
}