import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                list.add(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (list.isEmpty() || list.get(list.size() - 1) != '{') {
                    return false;
                }
                list.remove(list.size() - 1);
            } else if (s.charAt(i) == ']') {
                if (list.isEmpty() || list.get(list.size() - 1) != '[') {
                    return false;
                }
                list.remove(list.size() - 1);
            } else if (s.charAt(i) == ')') {
                if (list.isEmpty() || list.get(list.size() - 1) != '(') {
                    return false;
                }
                list.remove(list.size() - 1);
            }
        }

        return list.isEmpty();
    }
}
