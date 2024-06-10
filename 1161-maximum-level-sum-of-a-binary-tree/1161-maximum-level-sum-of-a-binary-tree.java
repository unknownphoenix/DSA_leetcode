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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int maxSum = Integer.MIN_VALUE, maxlevel = 0;
        int currentSum = 0, currentlevel = 0;
        while(q.size() > 0){
            currentlevel++;currentSum = 0;
            for (int  c = q.size(); c > 0; c--){
                root = q.remove();
                currentSum += root.val;
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                maxlevel = currentlevel;
            }
        }
        return maxlevel;
    }
}