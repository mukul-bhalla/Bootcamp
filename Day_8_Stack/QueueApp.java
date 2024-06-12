package Day_8_Stack;

class Queue {
    int front, rear;
    int size;
    int data[];

    public Queue(int size) {
        this.size = size;
        front = rear = -1;
        data = new int[size];
        // size = 0;
    }

    public void enqueue(int element) {
        if (size == 0) {
            front = 0;
        }
        if (size == data.length) {
            throw new RuntimeException("Queue is Full !");
        }

        rear++;
        size++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = element;
    }

    public boolean isEmpty() {
        if (size == 0 || front == rear) {
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
        if (size == 0) {
            throw new RuntimeException("Queue is Empty !");
        }
        int temp = data[front];
        front++;
        if (data.length == front) {
            front = 0;
        }
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return temp;
    }

}

public class QueueApp {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);

    }

}
