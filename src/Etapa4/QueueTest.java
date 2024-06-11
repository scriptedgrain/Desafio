package Etapa4;

public class QueueTest {
    public static void main(String[] args) {
        LinkedQueue<Integer> q = new LinkedQueue<Integer>();
        try {
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.dequeue();
            q.dequeue();
            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);
        } catch (OverflowException e) {
            System.out.println(e);
        }
        try {
            System.out.println(q.front());
            System.out.println(q.back());
            System.out.println(q.toString());
        } catch (UnderflowException e) {
            System.out.println(e);
        }
    }
}