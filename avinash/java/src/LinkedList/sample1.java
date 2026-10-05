package LinkedList;

import java.util.HashSet;
import java.util.TreeSet;

public class sample1 {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println(set1);
        set1.add(10);
        System.out.println(set1);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println(set1);
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(1000);
        t1.add(2000);
        t1.add(3000);
        t1.add(4000);
        t1.add(5000);
        System.out.println(t1);
        System.out.println(t1.headSet(2000));
        System.out.println(t1.tailSet(2500));
        System.out.println(t1.higher(3000));
        System.out.println(t1.lower(1000));
    }


}
