public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /* Tree example
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(10);
        TreeNode t7 = new TreeNode(9, t5, t6);
        TreeNode t4 = new TreeNode(1, t3, t7);
     */
}
