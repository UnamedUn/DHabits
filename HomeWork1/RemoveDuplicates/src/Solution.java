import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int[] result = IntStream.of(nums).distinct().toArray();
        int k = result.length;

        for (int i = 0; i < k; i++) {
            nums[i] = result[i];
        }

        return k;
    }
}
