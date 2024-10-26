import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> lengths = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!chars.contains(s.charAt(i))) {
                chars.add(s.charAt(i));
            } else {
                lengths.add(chars.size());

                while (true) {
                    if (chars.get(0).equals(s.charAt(i))) {
                        chars.remove(0);
                        break;
                    }
                    chars.remove(0);
                }
                chars.add(s.charAt(i));
            }
            if (i == s.length() - 1) {
                lengths.add(chars.size());
            }
        }

        int result = 0;

        for (int i = 0; i < lengths.size(); i++) {
            if (result < lengths.get(i)) {
                result = lengths.get(i);
            }
        }

        return result;
    }
}
