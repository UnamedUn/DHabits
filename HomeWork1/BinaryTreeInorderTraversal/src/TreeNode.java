public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("TreeNode [val = %s, left = %s, right = %s]", val, left, right);
    }

    public boolean isLeaf(){
        return left == null && right == null;
    }
}
