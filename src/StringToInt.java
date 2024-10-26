public class StringToInt {
    public int myAtoi(String s) {
        long result = 0;
        boolean isNeg = false;
        boolean isSigned = false;
        boolean hasBegun = false;

        for (int i = 0; i < s.length(); i++) {
            result *= 10;

            // check if digit
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) ==  '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {

                hasBegun = true;
                switch (s.charAt(i)) {
                    case '0':
                        result += 0;
                        break;
                    case '1':
                        result += 1;
                        break;
                    case '2':
                        result += 2;
                        break;
                    case '3':
                        result += 3;
                        break;
                    case '4':
                        result += 4;
                        break;
                    case '5':
                        result += 5;
                        break;
                    case '6':
                        result += 6;
                        break;
                    case '7':
                        result += 7;
                        break;
                    case '8':
                        result += 8;
                        break;
                    case '9':
                        result += 9;
                        break;
                }

            } else {

                if (hasBegun) {
                    result /= 10;
                    break;
                } else {

                    // remove whiespacet
                    if (s.charAt(i) == ' ' && !hasBegun) {
                        if (isSigned) {
                            break;
                        } else {
                            continue;
                        }
                        // check whether positive or negative
                    } else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && isSigned) {
                        break;
                    } else if (s.charAt(i) == '+') {
                        isSigned = true;
                        continue;
                    } else if (s.charAt(i) == '-') {
                        isSigned = true;
                        isNeg = true;
                    } else {
                        break;
                    }

                }

            }

            if (result > Integer.MAX_VALUE) {
                break;
            }


        }

        if (!hasBegun) {
            result = 0;
        }

        if (isNeg) {
            if (result > Math.pow(2, 31)) {
                result = Integer.MIN_VALUE;
            } else {
                result = -result;
            }
        } else {
            if (result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
            }
        }


        return (int) result;
    }
}
