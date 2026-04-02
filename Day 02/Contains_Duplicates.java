class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet();

    for(int i = 0; i < nums.length; i++){
      if(set.contains(nums[i])) return true; 
        set.add(nums[i]);
    }
      return false; 
  }
} 

/*
CONTAINS_DUPLICATE

This task was about finding a way to detact if there's any duplicate 
numbers in an array and return true if there's no duplicat otherwise, 
false.

So i uesd the HashSet which is a collection of unique elements,
meaning there should be no duplicta in that set eg.[1, 2, 3, 4]

*/