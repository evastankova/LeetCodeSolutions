public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counterOfOccurencesOfVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                counterOfOccurencesOfVal++;
            } else {
                break;
            }
        }

        return nums.length - counterOfOccurencesOfVal;
    }
}
