package com.company;

import com.single_linked_list.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

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
