class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>  HM = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int Complement = target - nums[i];

            if(HM.containsKey(Complement)){
                return new int[]{HM.get(Complement), i};
            }
            HM.put(nums[i], i);
        }
        return null;
    }
}
