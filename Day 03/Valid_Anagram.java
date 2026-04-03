class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ // auto false if num of char does'nt compare.
          return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
          count[s.charAt(i) - 'a'] ++ ; //increament because of you including the count of char.
          count[t.charAt(i) - 'a'] -- ; //decrease to compare the count of char matches by subing each you come across. 
        }
        for(int value : count){
          if(value != 0){
            return false;
          }
        }
        return true;
    }
}

/*  ----------REMEMBER-------------


  VALID ANAGRAM
  This is typically a String that contains the exact same char as another
  string, but order of char doesnt matter

  eg s = "car" , t = "rat"
    = false (Strings dont match)

    s = "racecar" , t = "carrace"
    = true (both strings contain duplicated char)
*/