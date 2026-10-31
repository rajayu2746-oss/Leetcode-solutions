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
    List<Integer> ans = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root, ans);
        int low = 0;
        int high = ans.size() - 1;
        while(low < high){
        int sum = ans.get(low) + ans.get(high);
        if(sum == k) return true;
       else if(sum > k){
            high --;
        }else{low++;}
        } return false;
    }
    void inorder(TreeNode node , List<Integer> ans){
        if(node == null) return;

        inorder(node.left , ans);
        ans.add(node.val);
        inorder(node.right , ans);
    }
}