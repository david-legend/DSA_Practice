package com.company.LinkedLists;

import java.util.ArrayList;

public class ReturnKthToLast {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(88);
        linkedList.append(88);
        linkedList.append(90);
        linkedList.append(99);

        ArrayList<Integer> test1 =  findKthToLast(linkedList.head, 1);
        print(test1);

        printKthToLast(linkedList.head, 1);
    }



    //My Solution
    public static ArrayList<Integer> findKthToLast(Node head, int k) {
        Node current = head;
        ArrayList<Integer> kToLast = new ArrayList<>();
        int count = 1;
        while (current != null) {
            if(count >= k) {
                kToLast.add(current.data);
            }
            current = current.next;
            count++;
        }

        return kToLast;
    }

    //Books Solution 1
    public static int printKthToLast(Node head, int k) {
        if(head == null) return 0;

        int index = printKthToLast(head.next, k) + 1;
        if(index == k) {
            System.out.println(k + " th to last node is " + head.data);
        }

        return index;
    }

    public static void print(ArrayList<Integer> data) {
        for(int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
}
