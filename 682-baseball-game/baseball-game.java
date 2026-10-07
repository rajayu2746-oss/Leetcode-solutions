class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String o : operations){
            if(o.equals("+")){
                int last = st.pop();
                int slast = st.peek();
                st.push(last);
                st.push(last + slast);
            }else if(o.equals("D")){
                st.push(2 * st.peek());
            }else if(o.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(o));
            }
        } int sum = 0 ;
        for(int i : st){
            sum += i;
        } return sum;
    }
}