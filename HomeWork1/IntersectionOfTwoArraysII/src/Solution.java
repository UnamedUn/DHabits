import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 == 0 || len2 == 0) {
            return null;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int k = 0;
        int lenR = 0;

        if (len1 > len2) {
            lenR = len2;
        } else {
            lenR = len1;
        }

        int[] result = new int[lenR];

        while (i < len1 && j < len2) {
            while (j < len2 && i < len1 && nums1[i] < nums2[j]) {
                i++;
            }
            while (i < len1 && j < len2 && nums2[j] < nums1[i]) {
                j++;
            }

            if (j < len2 && i < len1 && nums1[i] == nums2[j]) {
                System.out.println(nums2[j]);
                result[k] = nums2[j];
                k++;
                i++;
                j++;
            }

        }


        return Arrays.copyOf(result, k);
    }
}
