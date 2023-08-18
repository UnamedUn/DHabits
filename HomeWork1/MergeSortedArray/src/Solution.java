import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    public void merge(int nums1[], int m, int nums2[], int n) {
        final int[] result = new int[m + n];
        int pos1 = 0;
        int pos2 = 0;
        int idx = 0;

        while (pos1 < m && pos2 < n) {
            int v1 = nums1[pos1];
            int v2 = nums2[pos2];
            if (v1 < v2) {
                result[idx] = v1;
                idx++;
                pos1++;
            } else {
                result[idx] = v2;
                idx++;
                pos2++;
            }
        }

        while (pos1 < m) {
           result[idx] = nums1[pos1];
           idx++;
           pos1++;
        }

        while (pos2 < n) {
            result[idx] = nums2[pos2];
            idx++;
            pos2++;
        }

        for (int j =0; j < n+m; j++) {
            nums1[j] = result[j];
        }
    }
}
