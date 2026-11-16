class Solution {
    public boolean isSubstringPresent(String s) {
        int n = s.length();
       String reverse = new StringBuilder(s).reverse().toString();
       for(int i = 0 ; i < n - 1; i++){
           String small = s.substring(i , i + 2);
           if(reverse.contains(small)) return true;
       } return false;
    }
}