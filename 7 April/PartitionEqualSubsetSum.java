import java.util.Arrays;

class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        Boolean[][] memo = new Boolean[nums.length][target + 1];
        return solve(nums, 0, target, memo);
    }
    private boolean solve(int[] nums, int index, int target, Boolean[][] memo) {
        if (target == 0) return true;
        if (index >= nums.length || target < 0) return false;
        if (memo[index][target] != null) return memo[index][target];
        boolean take = solve(nums, index + 1, target - nums[index], memo);
        boolean notTake = solve(nums, index + 1, target, memo);
        memo[index][target] = take || notTake;
        return memo[index][target];
    }
}
