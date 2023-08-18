import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null)
            return null;
        int len = nums.length;
        if (len == 1)
            return new TreeNode(nums[0]);

        if (len == 2) {
            TreeNode tn = new TreeNode(nums[1]);
            tn.left = new TreeNode(nums[0]);
            return tn;
        }
        return createTree(nums, 0, len - 1);
    }

    public TreeNode createTree(int[] nums, int start, int end) {

        if (start > end) return null;
        int middle = (end + start) / 2;

        TreeNode tn = new TreeNode(nums[middle]);
        tn.left = createTree(nums, start, middle - 1);
        tn.right = createTree(nums, middle + 1, end);
        return tn;
    }
}
