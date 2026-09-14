class Solution {
    public String removeDuplicates(String s) {
        Stack < Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        } StringBuilder sc = new StringBuilder();
        for(char a : st){
            sc.append(a);
        } return sc.toString();
    }
}