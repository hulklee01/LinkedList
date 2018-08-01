package com.linkedlist.impl;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int ListLength() {
        int length = 0;
        ListNode currentNode = this;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public int findNthElement(int n) {
        ListNode currentNode = this;

        for(int i = 0; i < this.ListLength()-n; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void removeDuplicate() {
        ListNode headNode = this;
        while(headNode.getNext() != null) {
            ListNode compareNode = headNode.getNext();
            while(compareNode != null) {
                if(headNode.getData() == compareNode.getData()) {
                    headNode.setNext(compareNode.getNext());
                }
                compareNode = compareNode.getNext();
            }
            headNode = headNode.getNext();
        }
    }

    public void printLinkedList() {
        ListNode currentNode = this;
        while(currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.print("\n");
    }
}
