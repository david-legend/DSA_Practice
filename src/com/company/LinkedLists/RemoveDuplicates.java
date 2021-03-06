package com.company.LinkedLists;

// Question:: Write code to remove duplicates from an unsorted linked list.

import java.util.HashSet;

// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?
public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(88);
        linkedList.append(88);
        linkedList.append(90);
        linkedList.append(99);

        //Testing removing Duplicates
        deleteDuplicates(linkedList.head);
        System.out.println("Testing removing duplicates " + linkedList.head.next.data); //90

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(12);
        linkedList2.append(56);
        linkedList2.append(99);
        linkedList2.append(56);
        linkedList2.append(81);

        //Testing removing Duplicates
        deleteDuplicates(linkedList2.head);
        System.out.println("Testing removing duplicates " + linkedList2.head.next.next.next.data); //81

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append(12);
        linkedList3.append(56);
        linkedList3.append(99);
        linkedList3.append(56);
        linkedList3.append(81);

        //Testing removing Duplicates with no buffer
        deleteDuplicatesWithNoBufferAllowed(linkedList3.head);
        System.out.println("Testing removing Duplicates with no buffer " + linkedList2.head.next.next.next.data); //81


        LinkedList linkedList4 = new LinkedList();
        linkedList4.append(88);
        linkedList4.append(88);
        linkedList4.append(90);
        linkedList4.append(99);

        //Testing removing Duplicates with no buffer
        deleteDuplicatesWithNoBufferAllowed(linkedList4.head);
        System.out.println("Testing removing Duplicates with no buffer " + linkedList4.head.next.data); //90
    }

    public static void deleteDuplicates(Node node) {
        HashSet<Integer> set = new HashSet<>();
        Node previousNode = null;

        while (node != null) {
            if (set.contains(node.data)) {
                previousNode.next = node.next;
            } else {
                set.add(node.data);
                previousNode = node;
            }
            node = node.next;
        }
    }

    public static void deleteDuplicatesWithNoBufferAllowed(Node head) {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }

            }

            current = current.next;
        }
    }
}
