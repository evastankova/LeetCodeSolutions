public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int root = 1;

        for (long i = 1; i < x; i++) {
            if (i * i == x) {
                return (int)i;
            }
            if (i * i > x) {
                root = (int)i - 1;
                break;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2047400000));
    }
}
