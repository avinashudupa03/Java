package LinkedList;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {

        ArrayList<sample3> a1 = new ArrayList<>();
        sample3 s1 = new sample3(101, "ash", 100000, "IT");
        sample3 s2 = new sample3(102, "max", 250000, "IT");
        sample3 s3 = new sample3(103, "jerry", 450300, "IT");
        sample3 s4 = new sample3(104, "jack", 500000, "IT");
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        for(sample3 e:a1)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept());
        }
        a1.stream().filter(k->k.getSalary()<80000.00).forEach(k -> System.out.println(k.getName()) );
        System.out.println("Employee from IT dept");
        a1.stream().filter(k->k.getDept()=="IT").forEach(k-> System.out.println(k.getName()));
        
    }
}
