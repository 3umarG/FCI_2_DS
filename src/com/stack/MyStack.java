package com.stack;

public class MyStack {
    int top;
    int[] arr;
    int size;

    public MyStack(int size) {
        top = -1;
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if (top == size - 1) return true;
        else return false;
    }

    public void push(int value) {
       if (isFull()){
           System.out.println("Error");
       }else {
           top++;
           arr[top] = value;
       }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Error , Stack is Empty !!");
            return -1;
        }else {
            int temp = arr[top];
            top--;
            return temp;
        }
    }



    /*
    int[] arr;
    int top;
    int MAX_SIZE;


    public MyStack(int size) {
        arr = new int[size];
        top = -1;
        MAX_SIZE = size;
    }


    public void push(int num) {
        if (!isFull()) {
            arr[++top] = num;
        }
    }

    public int pop() {

        if (!isEmpty()){
            int temp = arr[top--];
            return temp;
        }
        return -1;

    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if (top == MAX_SIZE - 1) return true;
        else return false;
    }

     */

}
