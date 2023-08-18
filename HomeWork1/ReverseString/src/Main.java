import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Reverse String");

        Solution solution = new Solution();
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        String start = Arrays.toString(str);
        System.out.println(start);
        solution.reverseString(str);
        String reversed = Arrays.toString(str);
        System.out.println(reversed);
    }
}