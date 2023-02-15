public class codingBatScratch {
    // Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    // sum28([2, 3, 2, 2, 4, 2]) → true
    // sum28([2, 3, 2, 2, 4, 2, 2]) → false
    // sum28([1, 2, 3, 4]) → false

    public static boolean sum28(int[] nums) {
        int count = 0;
        for (int item : nums) {
            if (item == 2) {
                count+=2;
            }
        }
        if (count == 8) {
            return true;
        } else {
            return false;
        }
    }

    // Given an array of ints, return true if every element is a 1 or a 4
    // only14([1, 4, 1, 4]) → true
    // only14([1, 4, 2, 4]) → false
    // only14([1, 1]) → true

    public static boolean only14(int[] nums) {
        int count = 0;
        for (int item : nums) {
            if (item == 1 || item == 4) {
                count++;
            }
        }
        if (count == nums.length) {
            return true;
        } else {
            return false;
        }
    }
}