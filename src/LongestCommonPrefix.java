public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        result.append(strs[0]);
        boolean inequality = false;
        int counterWords = 1;
        int indexIneq = 0;

        while (counterWords < strs.length) {
            // find where the unequality of the strings begins
            for (int i = 0; i < result.length(); i++) {
                try {
                    if (result.charAt(i) != strs[counterWords].charAt(i)) {
                        inequality = true;
                        indexIneq = i;
                        break;
                    }
                } catch (IndexOutOfBoundsException e) {
                    inequality = true;
                    indexIneq = i;
                    break;
                }
            }
            // delete all chars after the inequality has been detected
            if (inequality) {
                while (true) {
                    try {
                        result.deleteCharAt(indexIneq);
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
            }

            counterWords++;
        }

        return result.toString();
    }
}
