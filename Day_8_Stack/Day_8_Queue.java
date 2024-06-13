package Day_8_Stack;

class Queue {
    int front, rear;
    int size;
    int data[];

    public Queue(int size) {
        this.size = size;
        front = rear = 0;
        data = new int[size];
    }

    public void enqueue(int element) {
        if ((rear + 1) % size == front) {
            throw new RuntimeException("Queue is Full !");
        }
        rear = (rear + 1) % size;
        data[rear] = element;
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    public void print() {
        while (!isEmpty()) {
            System.out.println(dequeue());
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty !");
        }
        int x = -1;
        front = (front + 1) % size;
        x = data[front];
        return x;

    }

}

public class Day_8_Queue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        // q.enqueue(5);
        // q.enqueue(6);
        System.out.println("Element Popped " + q.dequeue());
        System.out.println("Element Popped " + q.dequeue());
        System.out.println("Element Popped " + q.dequeue());
        System.out.println("Element Popped " + q.dequeue());
        // System.out.println("Element Popped " + q.dequeue());
        // System.out.println("Element Popped " + q.dequeue());
        q.enqueue(100);
        q.enqueue(29);
        q.enqueue(30);
        q.enqueue(23);
        // q.enqueue(25);
        q.print();

    }

}
