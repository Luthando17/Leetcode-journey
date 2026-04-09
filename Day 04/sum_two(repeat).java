class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>  HM = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int Complement = target - nums[1];

            if(HM.containsKey(complement)){
                return new int[]{i, HM.get(complement)};
            } else{
                HM.put(int[i], i);
            }
        }
        return null;
    }
}
