public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String sTrimmed = s.trim();

        if (!sTrimmed.contains(" ")) {
            return sTrimmed.length();
        }

        int result = 0;
        String newS = sTrimmed;

        for (int i = 0; i < sTrimmed.length(); i++) {
            if (sTrimmed.charAt(i) == ' ') {
                newS = sTrimmed.substring(i).trim();
                continue;
            }
            if (!newS.contains(" ")) {
                result = newS.length();
                break;
            }
        }

        return result;
    }
}
