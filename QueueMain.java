package com.bridgelabz.StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) {
//UC3:
        System.out.println(" *** Queue *** ");
        Queue<Integer> queue = new Queue<>();
        queue.append(56);
        queue.append(30);
        queue.append(70);
        queue.display();
    }
}
