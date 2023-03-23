package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList;

public class Stacks<T> {
    LinkedList <T> linkedList = new LinkedList<>();

    public void push(T data) {

        linkedList.push(data);
    }

    public void display() {

        linkedList.display();
    }
}
