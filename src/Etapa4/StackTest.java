package Etapa4;

public class StackTest {
    public static void main(String[] args) {
        LinkedStack<Integer> s = new LinkedStack<Integer>();
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
        } catch (OverflowException e) {
            System.out.println(e);
        }
        try {
            System.out.println(s.top());
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        } catch (UnderflowException e) {
            System.out.println(e);
        }
    }
}
