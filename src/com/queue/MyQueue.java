package com.queue;

public class MyQueue {

    int front;
    int rear;
    int[] arr;
    int size;
    int count;

    public MyQueue(int size) {
        arr = new int[size];
        this.size = size;
        front = 0;
        rear = size - 1;
        count = 0;
    }


    public boolean isFull() {
        if (count == size) return true;
        else return false;
    }

    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            rear = (rear + 1) % size;
            arr[rear] = value;
            count++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!!");
            return -1;
        } else {
            int temp = arr[front];
            front = (front + 1) % size;
            count--;
            return temp;
        }
    }
}
