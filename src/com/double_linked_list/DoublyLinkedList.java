package com.double_linked_list;

public class DoublyLinkedList {
    Link head;
    Link last;

    public DoublyLinkedList() {
        head = last = null;
    }

    public boolean isEmpty() {
        if (head == null || last == null) {
            return true;
        }
        return false;
    }

    public void insertFirst(int value) {
        Link newLink = new Link(value);
        if (isEmpty()) {
            head = last = newLink;
        } else {
            newLink.next = head;
            newLink.prev = null;
            head.prev = newLink;
            head = newLink;
        }
    }

    public void insertLast(int value) {
        Link newLink = new Link(value);
        if (isEmpty()) {
            head = last = newLink;
        } else {
            newLink.prev = last;
            newLink.next = null;
            last.next = newLink;
            last = newLink;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Can't Delete , List is already Empty !!");
        } else if (head == last) {
            // Only one item ...
            head = last = null;
        }else {
            // More than one item :
            last = last.prev;
            last.next = null;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Can't Delete , List is already Empty !!");
        } else if (head == last) {
            // Only one item ...
            head = last = null;
        } else {
            // More than one item :
            head = head.next;
            head.prev = null;
        }
    }

    public void displayItemsFromHead() {
        if (isEmpty())
            System.out.println("Linked List is Empty ...!!! ");
        else {
            Link current = head;
            System.out.print("[  ");
            while (current != null) {
                System.out.print(current.value + "  ");
                current = current.next;
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
