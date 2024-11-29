import com.sun.source.tree.Tree;

public class isSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean rightSubtree = isSameTree(p.right, q.right);
        return isSameTree(p.left, q.left) && rightSubtree;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10, new TreeNode(5), new TreeNode(15));
//        [10,5,null,null,15]
        TreeNode t2 = new TreeNode(10, new TreeNode(5, null, null), new TreeNode(15));
    }
}
