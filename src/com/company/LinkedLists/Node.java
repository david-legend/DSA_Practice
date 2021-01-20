//package com.company.LinkedLists;
//
//class SinglyLinkedListTest {
//    public static void main(String[] args) {
//
//        Node head = new Node(2);
//        head.appendToTail(9);
//        head.appendToTail(12);
//        head.appendToTail(19);
//
//
//
//        //Testing appending to tail
//        System.out.println(head.next.data); //9
//
//        //Testing Deletion
//        System.out.println("Before Deletion " + head.next.next.data); //12
//        head.deleteNode(head, 12);
//        System.out.println("After Deletion " +  head.next.next.data); //19
//
//        //count nodes Test
//        int count  = head.countNodes();
//        System.out.println("After Counting Nodes " +  count);
//    }
//}
//
//public class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//    }
//
//    public void appendToTail(int data) {
//        Node end = new Node(data);
//        Node n = this;
//
//        while (n.next != null) {
//            n = n.next;
//        }
//
//        n.next = end;
//    }
//
//    public int countNodes() {
//        int count = 1;
//        Node n = this;
//        while (n.next != null) {
//            count++;
//            n = next;
//        }
//
//        return count;
//    }
//

//    public Node deleteNode(Node head, int data) {
//        Node n = head;
//
//        if (n.data == data) {
//            return head.next;
//        }
//
//        while (n.next != null) {
//            if (n.next.data == data) {
//                n.next = n.next.next;
//                return head;
//            }
//
//            n = n.next;
//        }
//
//        return head;
//    }
//}
