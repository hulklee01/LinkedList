package com.linkedlist.impl;

public class Main {
    public static void main (String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(8);
        ListNode node5 = new ListNode(8);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(1);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);

        node1.printLinkedList();

        System.out.println(node1.findNthElement(3));

        node1.removeDuplicate();
        node1.printLinkedList();
    }
}
