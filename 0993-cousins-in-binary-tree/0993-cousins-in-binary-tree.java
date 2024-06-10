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
    int xparent = -1, xlevel = 0 , yparent = -1, ylevel = 0;
    public void dfs(TreeNode root, int parent, int level, int x, int y){
        if( root == null ) return;
        if( root.val == x){
            xparent = parent;
            xlevel = level;
        }
        if( root.val == y){
            yparent = parent;
            ylevel = level;
        }
        dfs(root.left,root.val,level+1,x,y);
        dfs(root.right,root.val,level+1,x,y); 
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,-1,0,x,y);
        return ((xparent != yparent) && (xlevel == ylevel));      
    }
}