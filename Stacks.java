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
    public T pop() {
        return linkedList.pop();
    }
    public void peak() {

        Integer peakedData = (Integer) linkedList.pop();
        System.out.println("The Peak Element = "+peakedData);
        linkedList.push((T) peakedData);
    }
}
