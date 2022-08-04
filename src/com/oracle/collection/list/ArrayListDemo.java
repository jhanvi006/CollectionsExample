package com.oracle.collection.list;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list);
        for (int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");
    }
}
