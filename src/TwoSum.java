public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        boolean found = false;
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            index1 = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    index2 = j;
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        indices[0] = index1;
        indices[1] = index2;
        return indices;
    }
}
