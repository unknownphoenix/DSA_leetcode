/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q || root == null) return root;
        TreeNode lh = lowestCommonAncestor(root.left , p , q);
        TreeNode rh = lowestCommonAncestor(root.right , p , q);
        if ( lh != null && rh != null) return root;
        return (lh != null) ? lh : rh;
    }
}