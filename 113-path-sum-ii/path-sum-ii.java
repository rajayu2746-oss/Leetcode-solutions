/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    List<Integer> lvl = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        fun(root , targetSum , lvl);
        return ans;
    }
    void fun(TreeNode node , int sum  , List<Integer> lvl){
         if(node == null) return;
           lvl.add(node.val);
         if(node.left == null && node.right == null && sum == node.val){
                ans.add(new ArrayList<>(lvl));
            }
            fun(node.left  ,sum - node.val , lvl);
            fun(node.right ,sum - node.val , lvl);
            lvl.remove(lvl.size()-1);
         } 
    }
