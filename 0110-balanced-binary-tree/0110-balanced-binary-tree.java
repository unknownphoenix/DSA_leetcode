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
    public static class Pair{
        int height = 0;
        boolean balanced = true;
    }
    public Pair dfs(TreeNode root) {
        // base case
        if (root == null ) return new Pair();
        Pair l = dfs(root.left);
        Pair r = dfs(root.right);
        Pair curr = new Pair ();
        curr.height = Math.max(l.height,r.height)+1;
        curr.balanced = l.balanced && r.balanced;
        if(Math.abs(l.height - r.height)>1) curr.balanced = false;
        return curr;
    }
    public Boolean isBalanced(TreeNode root){
      return dfs(root).balanced;
    }
}