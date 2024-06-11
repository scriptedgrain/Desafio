package Etapa4;

public class LinkedQueue<E> implements Queue<E> {
	private Node<E> head;
	private Node<E> tail;
	private int numElements;

	public LinkedQueue() {
		this.head = null;
		this.tail = null;
		this.numElements = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public boolean isFull() {
		return false;
	}

	public int numElements() {
		return numElements;
	}

	public void enqueue(E element) throws OverflowException, NullPointerException {
		if (isFull()) throw new OverflowException();
		
		Node<E> newNode = new Node<>(element);
		if (isEmpty())
			head = tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		numElements++;
	}

	public E dequeue() throws UnderflowException, NullPointerException {
		if (isEmpty()) throw new UnderflowException();

		E element = head.getElement();

		if (element == null) throw new NullPointerException();

		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();

		numElements--;
		return element;
	}
	
	public E front() throws UnderflowException, NullPointerException {
		if (isEmpty()) throw new UnderflowException();
		E element = head.getElement();
		if (element == null) throw new NullPointerException();
    	return head.getElement();
	}

	public E back() throws UnderflowException, NullPointerException {
		if (isEmpty()) throw new UnderflowException();
		E element = tail.getElement();
		if (element == null) throw new NullPointerException();
    	return tail.getElement();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> current = head;
		while (current != null) {
			sb.append(current.getElement().toString());
			sb.append(" ");
			current = current.getNext();
		}
		return sb.toString();
	}	
}