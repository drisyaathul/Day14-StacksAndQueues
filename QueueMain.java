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
        System.out.println();
//UC4:
        System.out.println(" *** Dequeue *** ");
        queue.deQueue();
        queue.display();
        Integer deQueue = queue.poplast();

            if (deQueue == null) {
                System.out.println("Queue is Empty");
            } else
                System.out.println("The Element popped is " + deQueue);
            queue.display();
    }
}


