package com.company.LinkedLists;

class LinkedListTest {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        //Testing append
        linkedList.append(8);
        linkedList.append(88);
        linkedList.append(90);

        System.out.println("Append: " + linkedList.head.data); //8
        System.out.println("Append: " + linkedList.head.next.data); //88
        System.out.println("Append: " + linkedList.head.next.next.data); //90

        //Testing prepend
        linkedList.prepend(42);
        System.out.println("After prepending value 42 to head:  " + linkedList.head.data);//42

        //Testing deleteWithValue
        linkedList.deleteWithValue(8);
        System.out.println("After deleting value 8: " + linkedList.head.next.data); //88

        //Testing countNodes
        int numberOfNodes = linkedList.countNodes();
        System.out.println("Number of Nodes: " + numberOfNodes); //3

        //Testing countNodes
        linkedList.appendAnyWhere(42, 47);
        System.out.println("After appending anywhere: " + linkedList.head.next.data); //47

        linkedList.appendAnyWhere(88, 197);
        System.out.println("After appending anywhere: " + linkedList.head.next.next.next.data); //197
    }
}

public class LinkedList {
    Node head;


    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public int countNodes() {
        int count = 1;
        Node current = head;
        while (current.next != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void appendAnyWhere(int prevData, int data) {
        if (head == null) {
            head = new Node(data);
        }

        if (head.data == prevData) {
            Node newNode = new Node(data);
            Node temp = head.next;
            head.next = newNode;
            newNode.next = temp;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == prevData) {
                Node newNode = new Node(data);
                Node temp = current.next.next;
                current.next.next = newNode;
                newNode.next = temp;
            }

            current = current.next;
        }
    }

    public boolean hasCycle() {
        if (head == null) return false;

        Node fast = head.next;
        Node slow = head;

        while (fast != null) {
            if (fast == slow) {
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}