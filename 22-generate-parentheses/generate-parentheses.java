class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0 , 0 , n , "");
        return ans;
    }
     void backtrack(int open , int close , int n , String s ){
        if(open == n && close == n){
            ans.add(s);
            return;
        }
         if(open < n ){
            backtrack(open + 1 ,close , n , s + "(");
         }
         if(close < open){
            backtrack(open , close + 1 , n , s + ")");
         } 

     }
}