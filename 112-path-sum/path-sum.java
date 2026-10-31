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
     boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        fun(root,0,targetSum);
        return ans;
    }
    void fun(TreeNode node , int sum , int targetSum){
        if(node == null) return;
         sum += node.val;
         if(node.left == null && node.right == null){
            if(sum == targetSum){
                ans = true;
             return;}
         }
         fun(node.left,sum,targetSum);
         fun(node.right,sum,targetSum);
    }
}