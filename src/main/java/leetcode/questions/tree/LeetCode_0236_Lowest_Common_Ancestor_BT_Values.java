package leetcode.questions.tree;

import utils.TreePrinter;

//236. Lowest Common Ancestor of a Binary Tree
//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two
// nodes p and q as the lowest node in T that has both p and q as descendants
// (where we allow a node to be a descendant of itself).”
public class LeetCode_0236_Lowest_Common_Ancestor_BT_Values {

    public static void main(String[] args) {

        TreeNode tree = TreePrinter.build("3,5,1,6,2,0,8,null,null,7,4,null,null,null,null");
        TreeNode treeNode = lowestCommonAncestor(tree, new TreeNode(2), new TreeNode(3));

        System.out.println("Result " + treeNode.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode A = path(root, p.val);
        TreeNode B = path(root, q.val);

        Integer result = null;

        TreeNode currentB = B;
        TreeNode currentA = A;

        while (currentB != null && currentA != null) {

            if (currentA.val == currentB.val) {
                result = currentA.val;
            }
            currentA = currentA.right;
            currentB = currentB.right;
        }
        return findTreeNode(root, result);
    }

    private static TreeNode findTreeNode(TreeNode tree, Integer result) {

        if (tree == null) {
            return null;
        }
        if (tree.val == result) {
            return tree;
        }

        TreeNode left = findTreeNode(tree.left, result);
        if (left != null) {
            return left;
        }
        TreeNode right = findTreeNode(tree.right, result);
        if (right != null) {
            return right;
        }
        return null;
    }

    public static TreeNode path(TreeNode root, Integer target) {

        if (root == null) {
            return null;
        }
        if (root.val == target) {
            return new TreeNode(root.val);
        }

        TreeNode pathLeft = path(root.left, target);
        TreeNode pathRight = path(root.right, target);

        if (pathLeft != null) {
            return new TreeNode(root.val, null, pathLeft);
        }
        if (pathRight != null) {
            return new TreeNode(root.val, null, pathRight);
        }

        return null;
    }
}