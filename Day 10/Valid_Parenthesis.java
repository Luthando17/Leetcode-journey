class Solution {
    public boolean isValid(String s) {
        Stack <Character> openStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '['){
                openStack.push(bracket);
            } else if (openStack.isEmpty()) {
                return false;
            } else if(bracket == ')' && openStack.peek()== '('){
                openStack.pop();
            } else if(bracket == '}' && openStack.peek()== '{'){
                openStack.pop();
            } else if(bracket == ']' && openStack.peek()== '['){
                openStack.pop();
            } else {
                return false;
            }
        }
        if(openStack.isEmpty()){
            return true;
        }
        return false;
    }
}


/*
REMEMBER!!!

This problem uses  STACK case ,the ability to keep track 
of the most inserted recent element.
The STACK uses a formula LIFO (last, in, first, out)

 and STACK works as a temp storage of given elements to keep
 track.

 * .push();
   .peek();
   .pop();

 */