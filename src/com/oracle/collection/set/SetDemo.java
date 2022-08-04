package com.oracle.collection.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        /*  Hash Set Demo*/
        Set hashSet =new HashSet<String>();
        hashSet.add("Jhanvi");
        hashSet.add("Karan");
        hashSet.add("");
        hashSet.add("Kabir");
        hashSet.add("Jhanvi");
        System.out.println("HashSet Example:");
        Iterator<String> itrSet= hashSet.iterator();
        while(itrSet.hasNext()){
            System.out.println(itrSet.next());
        }
        /*  LinkedHash Set Demo*/
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Jhanvi");
        linkedHashSet.add("Karan");
        linkedHashSet.add("");
        linkedHashSet.add("kabir");
        linkedHashSet.add("Jhanvi");
        System.out.println("LinkedHashSet Example:");
        Iterator<String> itrLhs = linkedHashSet.iterator();
        while(itrLhs.hasNext()){
            System.out.println(itrLhs.next());
        }
        /*  Tree Set Demo   */
        Set treeSet = new TreeSet();
        treeSet.add("Karan");
        treeSet.add("Jhanvi");
        treeSet.add("");
        treeSet.add("Kabir");
        treeSet.add("Jhanvi");
        System.out.println("TreeSet Example:");
        Iterator<String> itr= treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
