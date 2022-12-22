package com.single_linked_list;

public class SingleLinkedList {
    private Link head;

    public SingleLinkedList() {
        head = null;
    }

    public Link getHead() {
        return head;
    }

    public void insertFirst(int value) {
        Link newLink = new Link(value);
        if (head == null) {
            // 1.List is Empty
            head = newLink;
        } else {
            // 2.List is not Empty
            newLink.next = head;
            head = newLink;
        }
    }

    public void insertLast(int value) {
        Link newLink = new Link(value);
        if (head == null) {
            // 1. list is Empty
            head = newLink;
        } else if (head.next == null) {
            // 2. list has only one item
            head.next = newLink;
        } else {
            // 3. list has more than one item
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            // 1. Empty List
            System.out.println("List is Empty , you can not delete more !!");
        } else if (head.next == null) {
            // 2. One item in list
            head = null;
        } else {
            // 3. More than one item
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            // 1. Empty List
            System.out.println("List is Empty , you can not delete more !!");
        } else if (head.next == null) {
            // 2. One item in list
            head = null;
        } else {
            Link current = head;
            Link prev = null;
            while (current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }

    public void display(){
        Link current = head;
        while (current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
