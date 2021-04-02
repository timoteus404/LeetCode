package com.company;
//Runtime: 100.00%
//Memory:  20.00%

//recursive approach
//counting left nodes && right nodes
//checking the max of the node and adding root to it
public class MaxDepthBT {

    public int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return 1+Math.max(left, right);
        }

    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
