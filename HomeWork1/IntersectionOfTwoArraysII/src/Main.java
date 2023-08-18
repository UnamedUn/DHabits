import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{7, 2, 2, 4, 7, 0, 3, 4, 5};
        int[] nums2 = new int[]{3, 9, 8, 6, 1, 9};
        Solution solution = new Solution();
        int[] r = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(r));
        System.out.println("Hello world!");
    }
}