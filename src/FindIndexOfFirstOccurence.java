public class FindIndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        if (needle.equals(haystack)) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        int indexOfCurrentNeedleLetter = 0;
        String newHaystack = "";

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(indexOfCurrentNeedleLetter)) {
                newHaystack = haystack.substring(i);
                if (newHaystack.startsWith(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
