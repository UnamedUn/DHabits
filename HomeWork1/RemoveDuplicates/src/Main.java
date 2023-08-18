import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int []nums = new int[]{1,1,2};
        System.out.println(Arrays.toString(nums));

        Solution solution = new Solution();
        System.out.println("k = " +   solution.removeDuplicates(nums));

        System.out.println(Arrays.toString(nums));

    }
}