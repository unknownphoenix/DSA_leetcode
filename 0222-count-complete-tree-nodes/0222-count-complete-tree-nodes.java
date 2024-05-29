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
    public int leftTree(TreeNode root){
        if ( root == null) return 0;
        return 1+ leftTree(root.left);
    }
     public int rightTree(TreeNode root){
        if ( root == null) return 0;
        return 1+ rightTree(root.right);
    }
    public int countNodes(TreeNode root) {
        if ( root == null ) return 0;
        int lh = leftTree( root);
        int rh = rightTree( root);
            if ( lh == rh) return (1 << lh ) -1 ;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}