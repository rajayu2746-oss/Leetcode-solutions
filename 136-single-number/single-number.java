class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer , Integer> set = new HashMap<>();
       for(int i : nums){
       set.put(i , set.getOrDefault(i , 0) + 1);
    }
    for(int j : set.keySet()){
        if(set.get(j)==1) return j;
    } return -1;
}
}