package Day_8_Stack;

import java.util.ArrayList;

class Stack<T> {
    ArrayList<T> arr;
    int capacity;
    int top;

    Stack(int capacity) {
        arr = new ArrayList<T>(capacity);
        top = -1;
        this.capacity = capacity;
    }

    public void peek() {
        System.out.println(arr.get(top));
    }

    public void push(T element) {
        if (top < capacity - 1) {
            arr.add(top + 1, element);
            System.out.println(element + " element pushed");
            top++;
        } else {
            System.out.println("Stack Overflow !!");
        }
    }

    public void pop() {

        if (top == -1) {
            System.out.println("Buffer Underflow !!");
        } else {
            T element = arr.remove(top);
            top--;
            System.out.println("Popped " + element);
        }

    }

    boolean isEmpty() {
        return (top == -1);
    }

    int getSize() {
        return top;
    }

}

public class Day_8_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(4);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
