package leetcode.questions.tree;

//    104. Maximum Depth of Binary Tree
//    Given the root of a binary tree, return its maximum depth.
//    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class LeetCode_0104_Max_Depth {

    public static void main(String[] args) {

        System.out.println(maxDepth(new TreeNode(1, new TreeNode(21, new TreeNode(31), null), new TreeNode(22, new TreeNode(32), new TreeNode(33, new TreeNode(2), null)))));
    }

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}