package com.oracle.collection.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        /*  Priority queue  */
        System.out.println("--------------------Priority queue----------------");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Mango");
        priorityQueue.add("Banana");
        priorityQueue.add("Kiwi");
        System.out.println(priorityQueue);
        System.out.println("Queue Head: "+priorityQueue.peek());
        priorityQueue.remove("Kiwi");
        System.out.println(priorityQueue);
        System.out.println("Check if it contains mango: "+priorityQueue.contains("Mango"));

        /*  Deque   */
        System.out.println("--------------------Deque----------------");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Tomato");
        deque.add("Potato");
        deque.add("Onion");
        for (String str : deque) {
            System.out.print(str+" ");
        }
        System.out.println("\nQueue Head: "+deque.peekFirst());
        System.out.println("Queue Tail: "+deque.peekLast());
        deque.push("Cabbage");
        for (String str : deque) {
            System.out.print(str+" ");
        }
    }
}
