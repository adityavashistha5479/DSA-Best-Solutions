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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isSymmetricTest(root.left, root.right);
    }

    Boolean isSymmetricTest(TreeNode p , TreeNode q){
        if(p == null && q == null) //left & right node is NULL 
            return true; 
        
        else if(p == null || q == null) //one of them is Not NULL
            return false; 
        
        else if(p.val != q.val) 
            return false;
        
        return isSymmetricTest(p.left, q.right) && 
        isSymmetricTest(p.right,q.left);

    } 
}


















