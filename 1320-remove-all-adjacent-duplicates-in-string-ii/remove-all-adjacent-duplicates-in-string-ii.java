class Solution {
    public String removeDuplicates(String s, int k) {
       Stack < Character > st = new Stack<>();
       Stack < Integer > sc = new Stack<>();
       for(char c : s.toCharArray()){
        int count = 1;
        if(!st.isEmpty() && st.peek()== c){
             count = sc.peek() + 1;
             sc.pop();
             sc.push(count);
        }else{
            st.push(c);  sc.push(1);
        } 
        if(count == k){
            st.pop();
            sc.pop();
       } } StringBuilder ayu = new StringBuilder();
        for(int i = 0; i < st.size(); i++){
            char ch = st.get(i);
            int cnt = sc.get(i);
            for(int j = 0; j < cnt; j++){
                ayu.append(ch);
}
        } return ayu.toString(); 
    }
}
