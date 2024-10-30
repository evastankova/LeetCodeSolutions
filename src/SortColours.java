import java.util.Arrays;

public class SortColours {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int current = nums[j];
                    nums[j] = nums[i];
                    nums[i] = current;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
