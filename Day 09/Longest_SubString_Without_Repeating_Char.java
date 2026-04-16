class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> HashSet = new HashSet<>();

        int l = 0; int r = 0; int max = 0;

        while(r < s.length()) {
            if(!HashSet.contains(s.charAt(r))) {
                HashSet.add(s.charAt(r));
                max = Math.max(max,HashSet.size());
                r++;
            } else {
                HashSet.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}



/*
REMEMBER!!!
So by solving this problem i am using the hashset window together 
with the Two Pointer, to go through the Char and Hastset to save the
non-Duplicate otherwise  remove them.
Therfore Checking the lojngest/most numb of char without duplicate
in the Hashset window saved under int(max) then return as output.

*/