public class RemoveElement {
    public static void printArr(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 4, 4, 6, 3};
        int value = 3;
        printArr(nums);
        System.out.println();
        System.out.println(removeElement(nums, value));
    }
}
