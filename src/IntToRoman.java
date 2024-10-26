public class IntToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        // check how long should the array be
        byte counter = 0;
        int currNum = num;
        while (currNum != 0) {
            counter++;
            currNum /= 10;
        }

        // put the digits of the number in an array
        int[] digits = new int[counter];
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        // convert each digit in roman
        for (int i = 0; i < digits.length; i++) {
            // make the number as big as it should be, e.g 1 = 100
            counter--;
            byte currCounter = counter;
            int curr = digits[i];
            while (currCounter != 0) {
                curr *= 10;
                currCounter--;
            }
            StringBuilder currRoman = new StringBuilder();

            // thousands to roman
            if (curr > 999) { // M

                for (int j = 0; j < digits[i]; j++) {
                    currRoman.append('M');
                }

                // hundreds to roman
            } else if (curr < 1000 && curr > 99) { // D C

                if (digits[i] < 4) {
                    currRoman.append("C".repeat(Math.max(0, digits[i])));
                } else if (digits[i] == 4) {
                    currRoman.append("CD");
                } else if (digits[i] == 5) {
                    currRoman.append('D');
                } else if (digits[i] < 9) {
                    currRoman.append('D');
                    currRoman.append("C".repeat(Math.max(0, digits[i] - 5)));
                } else if (digits[i] == 9) {
                    currRoman.append("CM");
                }

                // tens to roman
            } else if (curr < 100 && curr > 9) { // L X

                if (digits[i] < 4) {
                    currRoman.append("X".repeat(Math.max(0, digits[i])));
                } else if (digits[i] == 4) {
                    currRoman.append("XL");
                } else if (digits[i] == 5) {
                    currRoman.append('L');
                }else if (digits[i] < 9) {
                    currRoman.append('L');
                    currRoman.append("X".repeat(Math.max(0, digits[i] - 5)));
                } else if (digits[i] == 9) {
                    currRoman.append("XC");
                }

                // ones to roman
            } else if (curr < 10) { // V I

                if (digits[i] < 4) {
                    currRoman.append("I".repeat(Math.max(0, digits[i])));
                } else if (digits[i] == 4) {
                    currRoman.append("IV");
                } else if (digits[i] == 5) {
                    currRoman.append('V');
                }else if (digits[i] < 9) {
                    currRoman.append('V');
                    currRoman.append("I".repeat(Math.max(0, digits[i] - 5)));
                } else if (digits[i] == 9) {
                    currRoman.append("IX");
                }

            }
            result.append(currRoman);
        }

        return result.toString();
    }
}
