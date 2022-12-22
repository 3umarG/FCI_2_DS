package com.company;

import com.circular_linked_list.CircularLinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertFirst(0);
        list.display();
        System.out.println("----------");
        list.deleteFirst();
        list.display();
        System.out.println("----------");
        list.deleteLast();
        list.display();

    }
}
