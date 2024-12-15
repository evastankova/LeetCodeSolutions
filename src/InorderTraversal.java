import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InorderTraversal {
    // in-order: left - root - right
    public static List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversalHelper(root, new ArrayList<>());
    }

    private static List<Integer> inorderTraversalHelper(TreeNode currentNode, List<Integer> result) {
        if (currentNode == null) {
            return result;
        }
        result.addAll(inorderTraversalHelper(currentNode.left, new ArrayList<>()));
        result.add(currentNode.val);
        result.addAll(inorderTraversalHelper(currentNode.right, new ArrayList<>()));
        return result;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(10);
        TreeNode t7 = new TreeNode(9, t5, t6);
        TreeNode t4 = new TreeNode(1, t3, t7);
        System.out.println(inorderTraversal(t4));
    }
}
