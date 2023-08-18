// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Valid Palirome!");

        var solution = new Solution();
        //String s = "A man, a plan, a canal: Panama";
        String s = "0P";
        System.out.println("s = " + s);
        System.out.println(solution.isPalindrome(s));
    }
}