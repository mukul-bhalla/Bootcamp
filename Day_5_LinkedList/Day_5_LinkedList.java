package Day_5_LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_5_LinkedList {
    Node head = null;

    public void insertionAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertionAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = newNode;
    }

    public void insertionAnywhere(int pos, int data) {
        Node newNode = new Node(data);
        Node curr = head, prev = head;
        while (curr != null && pos > 1) {
            prev = curr;
            curr = curr.next;
            pos--;
        }
        if (pos == 1) {
            prev.next = newNode;
            newNode = curr;
        }

    }

    public void deletionAtFirst() {
        if (head == null) {
            System.out.println("Not Possible");
            return;
        }
        head = head.next;
    }

    public void deletionAtEnd() {
        if (head == null) {
            System.out.println("Not Possible");
            return;
        }
        Node curr = head, prev = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;

    }

    public void deletionAnywhere(int pos) {
        Node curr = head, prev = head;
        if (pos == 1) {
            deletionAtFirst();
            return;
        }
        while (curr != null && pos > 1) {
            prev = curr;
            curr = curr.next;
            pos--;
        }
        if (pos == 1) {
            prev.next = curr.next;
            curr.next = null;
        }

    }

    public static void main(String[] args) {
        Day_5_LinkedList obj = new Day_5_LinkedList();
        obj.insertionAtFirst(1);
        obj.insertionAtEnd(2);
        obj.insertionAtEnd(3);
        obj.insertionAtEnd(4);
        obj.insertionAtEnd(5);

        obj.deletionAnywhere(1);
        Node temp = obj.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
