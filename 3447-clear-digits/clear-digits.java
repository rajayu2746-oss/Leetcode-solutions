class Solution {
    public String clearDigits(String s) {
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(c);
            }
        } String ayush = "";
         for(char a : st){
             ayush = ayush + a;
        } return ayush;
    }
}