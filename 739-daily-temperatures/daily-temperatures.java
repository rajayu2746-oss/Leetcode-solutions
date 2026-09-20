class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack <Integer> st = new Stack<>();
       int n = temperatures.length;
       int []ayush = new int[n];
       ayush[n-1] = 0;
       st.push(n-1);
       for(int i = n - 2; i >= 0 ; i --){
        while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
            st.pop();
        } if(st.isEmpty()){
            ayush[i] = 0 ;
        }else{ayush[i] = st.peek() - i;} st.push(i);
       }return ayush;
    }
}