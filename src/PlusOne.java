public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }

        digits[digits.length - 1] = 0;
        int ednoNaUm = 1;
        int[] newDigits = new int[digits.length + 1];
        boolean needForNewArray = false;

        for (int i = digits.length - 2; i > -1; i--) {
            if (i == 0 && digits[i] == 9) {
                needForNewArray = true;
                break;
            }
            if (digits[i] == 9) {
                digits[i] = 0;
                ednoNaUm = 1;
            } else {
                digits[i] += ednoNaUm;
                if (digits[i] > 9) {
                    digits[i] = 0;
                    ednoNaUm = 1;
                } else {
                    return digits;
                }
            }
        }

        if (needForNewArray) {
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = 0;
            }
            return newDigits;
        }

        return digits;
    }
}
