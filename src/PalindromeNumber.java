public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean result = false;
        int currX = x;
        int reverse = 0;

        if (x >= 0) {

            if (x < 10) {
                result = true;
            } else {

                while (currX != 0) {
                    reverse *= 10;
                    reverse += currX % 10;
                    currX /= 10;
                }

                if (x == reverse) {
                    result = true;
                }



            }

        }

        return result;
    }
}
