// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);

        Solution solution = new Solution();
        int [] arr = {1,2,3};
        TreeNode tn1 = solution.sortedArrayToBST(arr);

        System.out.printf("Hello and welcome!");
    }
}