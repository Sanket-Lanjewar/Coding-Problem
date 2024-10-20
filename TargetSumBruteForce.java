public class TargetSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        findTargetSum(arr, target);
    }

    // Method to find two numbers that add up to the target
    public static void findTargetSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found: " + nums[i] + ", " + nums[j]);
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }
}



