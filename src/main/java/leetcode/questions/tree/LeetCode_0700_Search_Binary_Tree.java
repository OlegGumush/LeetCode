package leetcode.questions.tree;

//        700. Seach Binary Tree

public class LeetCode_0700_Search_Binary_Tree {

    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(3), new TreeNode(2)))));


        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (q == null) {
            return false;
        }
        if (p == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}