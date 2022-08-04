package com.oracle.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C");
        linkedList.add("C#");
        System.out.println(linkedList);
        linkedList.add(1, "C++");
        System.out.println(linkedList);
    }
}
