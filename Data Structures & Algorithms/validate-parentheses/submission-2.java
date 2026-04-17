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
