package list;

public class MyDoubleLinkedList<T> implements IList<T> {

    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        // size()
        // clear()
        // add()
    }

    @Override
    public void add(T t) {
        Node last = this.tail.prev;
        Node newNode = new Node(t, last, tail);
        last.next = newNode;
        this.tail.prev = newNode;
        this.size++;

        // 그 다음 get(index)
    }

    @Override
    public void insert(int index, T t) {
        if (index > this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node prev = null;
        Node current = null;
        int i = 0;

        if (index < this.size / 2) {
            prev = this.head;
            current = this.head.next;
            while (i++ < index) {
                prev = prev.next;
                current = current.next;
            }
        } else {
            current = this.tail;
            prev = this.tail.prev;
            while (i++ < (this.size - index)) {
                current = current.prev;
                prev = prev.prev;
            }
        }
        Node newNode = new Node(t, prev, current);
        current.prev = newNode;
        prev.next = newNode;
        this.size++;
        // 그 다음 delete by index
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = this.tail;
        this.head.prev = null;
        this.tail.next = null;
        this.tail.prev = this.head;
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head;
        Node current = prev.next;
        while (current != null) {
            if (current.data.equals(t)) {
                prev.next = current.next;
                current.next.prev = prev;
                current.next = null;
                current.prev = null;
                this.size--;
                return true;
            }
            prev = prev.next;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node prev = null;
        Node current = null;
        Node next = null;

        int i = 0;
        if (index < this.size / 2) {
            prev = this.head;
            current = this.head.next;
            while (i++ < index) {
                prev = prev.next;
                current = current.next;
            }
            prev.next = current.next;
            current.next.prev = prev;
            current.next = null;
            current.prev = null;
        } else {
            current = this.tail.prev;
            next = this.tail;
            while (i++ < (this.size - index - 1)) {
                next = next.prev;
                current = current.prev;
            }
            next.prev = current.prev;
            current.prev.next = next;
            current.next = null;
            current.prev = null;
        }
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node current = null;
        if (index < this.size / 2) {
            current = this.head.next;
            while (i++ < index) {
                current = current.next;
            }
        } else {
            current = this.tail.prev;
            while (i++ < (this.size - index - 1)) {
                current = current.prev;
            }
        }
        return current.data;
        // 그 다음 insert(index)
    }

    @Override
    public int indexOf(T t) {
        Node current = this.head.next;
        int index = 0;
        while (current != null) {
            if (current.data != null && current.data.equals(t)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    @Override
    public boolean contains(T t) {
        Node current = this.head.next;
        while (current != null) {
            if (current.data != null && current.data.equals(t)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node prev;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
