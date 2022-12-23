package com.double_linked_list;

public class Link {
    int value;
    Link next;
    Link prev;

    public Link(int value){
        next=null;
        prev=null;
        this.value = value;
    }
}
