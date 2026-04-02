class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> HM = new HashMap<>();
        
        for(int i = 0; i <= nums.length; i++){
            int complement = target - nums[i];

            if(HM.containsKey(complement)){
                return new int[]{i, HM.get(complement)};
            } else {
                HM.put(nums[i], i);
            }
        } 
        return null;
    }
}

/*
-----This rep the above Code { num per line}-----

  3 = nums = [2, 7, 11] These repreent the above(REMEMBER)
      HM = [2:0,  7:1, 11:2]

  5 = GO THROUGH each number 1by1

  6 = This is C = T(9) - N(2) = 7

  9 = check if saw it 

  10 = if Yes > return ans = return [1, 0]
  
  12 = store number if not found {number -> index =eg. 2:0} 


*/