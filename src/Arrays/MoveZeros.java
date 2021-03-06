package Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
