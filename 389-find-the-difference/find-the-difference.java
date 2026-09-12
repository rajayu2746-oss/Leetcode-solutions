class Solution {
    public char findTheDifference(String s, String t) {
       HashMap<Character , Integer > map = new HashMap<>();
       for(char c  : s.toCharArray()){
        map.put(c,map.getOrDefault(c,0) + 1);
       }
       for(char a : t.toCharArray()){
        if(!map.containsKey(a)) return a;
         map.put(a,map.get(a) - 1);
         if(map.get(a) < 0) return a;
       } return ' '; 
    }
}