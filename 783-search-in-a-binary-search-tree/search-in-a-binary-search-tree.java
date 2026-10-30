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
    public TreeNode searchBST(TreeNode root, int val) {
       return fun(root , val );
        
    }
    TreeNode fun(TreeNode node , int val ){
        if(node == null) return node;
        if(node.val == val) {
            return node;
        } 
        if(node.val > val){
          return fun(node.left,val );
        }else{
          return fun(node.right , val);
        }
    }
}