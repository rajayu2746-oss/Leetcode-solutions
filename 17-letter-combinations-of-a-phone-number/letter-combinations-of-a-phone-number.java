class Solution {
    ArrayList<String> list = new ArrayList<>();
     String[] map = {
        "","", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"
      };
 public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return list;
        }
      fun(digits,digits.length(),0,new StringBuilder() ,list);
      return list;
    }
    void fun(String digits , int n, int idx ,StringBuilder diary ,List<String> list){
        if(idx == n){
         list.add(diary.toString());
         return;
        }
        String choice = map[digits.charAt(idx) - '0'];
        for(char ch : choice.toCharArray()){
            diary.append(ch);
            fun(digits,n ,idx+1,diary,list);
            diary.deleteCharAt(diary.length() - 1);
        }
    }
}