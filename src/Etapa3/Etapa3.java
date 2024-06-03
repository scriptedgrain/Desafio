package Etapa3;
import java.util.Stack;

public class Etapa3 {
    public boolean checkBrackets(Stack<Character> s1) {
        Stack<Character> stack = new Stack<>();
        
        while (!s1.isEmpty()) {
            char current = s1.pop();
            if (current == ')') {
                stack.push(current);
            } else if (current == '(') {
                if (stack.isEmpty() || stack.peek() != ')') {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
