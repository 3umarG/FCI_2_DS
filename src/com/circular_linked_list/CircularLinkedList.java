package com.circular_linked_list;

public class CircularLinkedList {
    private Link head;

    public CircularLinkedList() {
        head = null;
    }

    public Link getHead() {
        return head;
    }

    public void insertFirst(int value) {
        Link newLink = new Link(value);
        if (head == null) {
            // 1. List is empty
            head = newLink;
            newLink.next = head;
        } else {
            // 2. List is not empty
            Link current = head;
            while (current.next != head){
                current = current.next;
            }
            current.next = newLink;
            newLink.next = head;
            head = newLink;
        }
    }

    public void insertLast(int value) {
        Link newLink = new Link(value);
        if (head == null) {
            // 1. list is Empty
            head = newLink;
            head.next = head;
        } else if (head.next == head) {
            // 2. list has only one item
            head.next = newLink;
            newLink.next = head;
        } else {
            // 3. list has more than one item
            Link current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newLink;
            newLink.next = head;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            // 1. Empty List
            System.out.println("List is Empty , you can not delete more !!");
        } else if (head.next == head) {
            // 2. One item in list
            head = null;
        } else {
            // 3. More than one item
            Link current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            // 1. Empty List
            System.out.println("List is Empty , you can not delete more !!");
        } else if (head.next == head) {
            // 2. One item in list
            head = null;
        } else {
            Link current = head;
            Link prev = null;
            while (current.next != head) {
                prev = current;
                current = current.next;
            }
            prev.next = head;
            current.next = null;
        }
    }

    public void display(){
        Link current = head;
        while (current.next != head){
            System.out.println(current.value);
            current = current.next;
        }
    }

}
