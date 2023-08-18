import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charS = getCharCounter(s);
        Map<Character, Integer> charT = getCharCounter(t);
        return charS.equals(charT);
    }

    public Map<Character, Integer> getCharCounter(final String s) {
        final Map<Character, Integer> charCounter = new TreeMap<>();

        for (char curChar : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(curChar)) {
                charCounter.putIfAbsent(curChar, 0);
                charCounter.computeIfPresent(curChar, (key, value) -> value+1);
            }
        }

        return charCounter;
    }
}
