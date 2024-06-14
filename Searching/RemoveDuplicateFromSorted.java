package Searching;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3 };
        int r = removeDup(nums);
        System.out.println(r);
    }

    public static int removeDup(int[] nums) {
        int writer = 0;
        for (int reader = 1; reader < nums.length; reader++) {
            if (nums[writer] != nums[reader]) {
                writer++;
                nums[writer] = nums[reader];
            }
        }
        return writer + 1;
    }
}
