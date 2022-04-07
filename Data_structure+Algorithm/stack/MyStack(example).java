package stack;

public class MyStack<T> implements IStack<T> {

    private int size = 0;
    private Node head = new Node();

    @Override
    public void push(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Node ret = head.next;
        head.next = ret.next;
        this.size--;
        return ret.data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    private class Node {
        Node next;
        T data;
    }
}
