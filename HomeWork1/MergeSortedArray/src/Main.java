import java.util.Arrays;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        int nums1[] = new int[] {1,2,3,0,0,0};
        int nums2[] = new int[] {2,5,6};
         */
        int nums1[] = new int[] {2,0};
        int nums2[] = new int[] {1};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        Solution solution = new Solution();
        solution.merge(nums1, 1, nums2, 1);

        System.out.println("Result:");
        System.out.println(Arrays.toString(nums1));
    }
}