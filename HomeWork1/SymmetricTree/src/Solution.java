import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public boolean isSymmetric(final TreeNode root) {
        if (root == null)
            return true;

        return isSymmetricRecursive(root.left, root.right, true);
    }

    public boolean isSymmetricRecursive(final TreeNode left, final TreeNode right, final boolean checkVal) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (checkVal && left.val != right.val)
            return false;
        return isSymmetricRecursive(left.right, right.left, true) &&
                isSymmetricRecursive(left.left, right.right, true);
    }
}
