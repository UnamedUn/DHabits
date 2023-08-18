import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int maxDepth(TreeNode root) {
        //завершение рекурсии
        if (root == null)
            return 0;

        final int leftHeight = maxDepth(root.left);
        final int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        TreeNode currentNode = root;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                result.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }

        return result;
    }
}
