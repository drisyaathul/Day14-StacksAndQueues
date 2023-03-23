package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList;

public class Queue<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    public void append(T data) {
        linkedList.append(data);
    }
    public void display() {
        linkedList.display();
    }
}
