package Day_8_Stack;

import java.util.ArrayList;

class Stack<T> {
    ArrayList<T> arr;
    int size;
    int top;

    Stack(int size) {
        arr = new ArrayList<T>(size);
        top = -1;
        this.size = size;
    }

    public void peek(int pos) {
        int idx = top - pos + 1;
        System.out.println(arr.get(idx));
    }

    public void push(T element) {
        if (top < size - 1) {
            arr.add(top + 1, element);
            System.out.println(element + " element pushed");
            top++;
        } else {
            System.out.println("Stack Overflow !!");
        }
    }

    public T pop() {
        T x = null;
        if (top == -1) {
            System.out.println("Buffer Underflow !!");
        } else {
            x = arr.remove(top);
            top--;
            System.out.println("Popped " + x);
        }
        return x;

    }

    boolean isEmpty() {
        return (top == -1);
    }

    int getSize() {
        return top + 1;
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
        System.out.println(stack.pop());
        stack.push(500);
        stack.peek(1);
        System.out.println("Size is = " + stack.getSize());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty ? :" + stack.isEmpty());
        stack.pop();
        stack.pop();
        ;

    }
}
