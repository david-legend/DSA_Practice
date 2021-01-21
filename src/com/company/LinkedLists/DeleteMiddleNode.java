package com.company.LinkedLists;

public class DeleteMiddleNode {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(88);
        linkedList.append(88);
        linkedList.append(90);
        linkedList.append(99);

        //Testing delete node
        deleteNode(linkedList.head.next);
        System.out.println("Testing delete node " + linkedList.head.next.data); //90
    }

    public static boolean deleteNode(Node node) {
        if (node == null || node.next == null) {
            return false;
        }

        Node next = node.next;
        node.data = next.data;
        node.next = next.next;

        return true;
    }
}
