import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start < end) {
                start++;
            }

            while (!Character.isLetterOrDigit(s.charAt(end)) && start < end) {
                end--;
            }

            if ((Character.toLowerCase(s.charAt(start++))) != Character.toLowerCase(s.charAt(end--)))
                return false;

            //System.out.println(s.charAt(start++) + " >> " + s.charAt(end--));
        }

        return true;
    }


}
