import java.util.ArrayList;
import java.util.List;

public class IsHappy {
    public static boolean isHappy(int n) {
        return isHappyHelper(n, new ArrayList<>());
    }

    public static boolean isHappyHelper(int n, List<Integer> list) {
        if (isAPowerOf10(n)) {
            return true;
        }
        int sum = findSum(n);

        if (sum % 2 == 0) {
            if (isAPowerOf10(sum)) {
                return true;
            }
        }
        if (list.contains(sum)) {
            return false;
        }
        list.add(sum);
        return isHappyHelper(sum, list);
    }

    public static int findSum(int n) {
        if (n < 10) {
            return (int) Math.pow(n, 2);
        }
        int sum = 0;
        while (n > 0) {
            if (n < 10) {
                sum += (int) Math.pow(n, 2);
                break;
            }
            sum += (int)Math.pow(n % 10, 2);
            n -= n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isAPowerOf10(double n) {
        if (n == 1.0) {
            return true;
        }
        if (n < 10.0) {
            return false;
        }
        return isAPowerOf10(n / 10);
    }

    public static void main(String[] args) {
//        System.out.println(findSum(19));
        System.out.println(isHappy(19));
//        System.out.println(isAPowerOf10(18));
    }
}
