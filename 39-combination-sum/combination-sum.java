class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        fun(candidates , n , 0 , diary , result , target ,0);
          return result;
    }
    void fun(int[] candidates , int n , int idx , List<Integer> diary ,List<List<Integer>> result, int target, int sum){
            if(sum == target){
                result.add(new ArrayList<>(diary));
                return;
            }
             if(idx == n) return;
        fun(candidates , n , idx + 1,diary,result,target,sum );
        if(candidates[idx] + sum <= target){
            diary.add(candidates[idx]);
        fun(candidates , n , idx , diary , result , target , sum + candidates[idx]);
        diary.remove(diary.size() - 1);
    } return;
}
}