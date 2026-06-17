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

    int diameter=0;   //global var

    public int diameterOfBinaryTree(TreeNode root) {
        heightOfTree(root);   //run to get the latest diameter
        return diameter;
    }

    public int heightOfTree(TreeNode root)
    {
        if(root==null)
            return 0;
        int right = heightOfTree(root.right);
        int left = heightOfTree(root.left);

        int height=Math.max(left, right)+1;
        diameter= Math.max(diameter, left+right);   //updating diameter according to current node

        return height;
    }
}
