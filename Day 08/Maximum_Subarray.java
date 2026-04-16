class Solution {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
        maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);// max between 2 things
        max = Math.max(max, maxCurrent);// compare the max between 2 things (highest)
        }
        return max;
    }
}
