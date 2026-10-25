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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        fun(root , list);
        return list;
    
            }
            void fun(TreeNode Node , List<Integer> list){
                if(Node == null) return;
                
                list.add(Node.val);
                fun(Node.left , list);
                fun(Node.right , list);
                return;
            }
}