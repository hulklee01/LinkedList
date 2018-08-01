package com.linkedlist.impl;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(7);
//        ListNode node4 = new ListNode(8);
//        ListNode node5 = new ListNode(8);
//        ListNode node6 = new ListNode(3);
//        ListNode node7 = new ListNode(6);
//        ListNode node8 = new ListNode(1);
//
//        node1.setNext(node2);
//        node2.setNext(node3);
//        node3.setNext(node4);
//        node4.setNext(node5);
//        node5.setNext(node6);
//        node6.setNext(node7);
//        node7.setNext(node8);


        Scanner sc = null;
        int lengthOfList;

        try {
            sc = new Scanner(new File("input.txt"));
            lengthOfList = sc.nextInt();
            ListNode[] linkedList = new ListNode[lengthOfList];
            System.out.println(lengthOfList);

            for(int i = 0; i < lengthOfList; i++) {
                linkedList[i] = new ListNode(sc.nextInt());
            }

            for(int i = 0; i < lengthOfList-1; i++) {
                linkedList[i].setNext(linkedList[i+1]);
            }

            linkedList[0].printLinkedList();

            System.out.println(linkedList[0].findNthElement(3));

            linkedList[0].removeDuplicate();
            linkedList[0].printLinkedList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
