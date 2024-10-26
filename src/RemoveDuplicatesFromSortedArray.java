public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // search for duplicates and find out how many non duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1] || nums[i] == nums[i - 1]) {
                nums[i] = Integer.MIN_VALUE;
            } else {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == nums[i]) {
                        nums[i] = Integer.MIN_VALUE;
                    }
                }
            }
        }

        // put duplicates at the back
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != Integer.MIN_VALUE) {
                        nums[i] = nums[j];
                        nums[j] = Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
        int counterUniqueEls = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                counterUniqueEls++;
            }
        }

        return counterUniqueEls;
    }
}
