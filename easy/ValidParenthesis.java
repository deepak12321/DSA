import java.util.Stack;

public class ValidParenthesis {
    /*
     * Peoblem Link - https://leetcode.com/problems/valid-parentheses/description/
     * 
     * 3 ms
     * Beats 62.09%
     * 
     */

}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() && (ch == ']' || ch == '}' || ch == ')'))
                return false;

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                continue;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}