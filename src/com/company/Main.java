package com.company;

import com.circular_linked_list.CircularLinkedList;
import com.double_linked_list.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertFirst(0);
        list.displayItemsFromHead();
        System.out.println("----------");
        list.deleteFirst();
        list.displayItemsFromHead();
        System.out.println("----------");
        list.deleteLast();
        list.displayItemsFromHead();

    }
}
