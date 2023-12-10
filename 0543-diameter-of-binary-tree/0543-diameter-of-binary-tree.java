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
    
    public class Ans
    {
        int ans = Integer.MIN_VALUE;
    }
    
    public int height(TreeNode root, Ans a )
    {
        if(root == null)
            return 0;
        int left = height(root.left, a);
        int right=height(root.right, a);
        
        a.ans = Math.max(a.ans, left+right);
        
        return 1+Math.max(left, right);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if (root == null)
            return 0;
        Ans a = new Ans();
        
        int height_of_tree = height(root, a);  
        return a.ans;  
        
        
        
    }
    
}