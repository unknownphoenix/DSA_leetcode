

class Solution {
    public Node connect(Node root) {
        if ( root == null) return null;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(q.size() > 0){
            for(int c = q.size(); c>0; c--){
                Node curr = q.remove();
                if(c > 1) curr.next = q.peek();
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return root;
    }
}