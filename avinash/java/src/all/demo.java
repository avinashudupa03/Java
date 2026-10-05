package all;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        employee e1=new employee(1,35,"ram");
        employee e2=new employee(2,35,"max");

        ArrayList<employee>list1=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(new employee(3,44,"ash"));

        for(employee e:list1)
        {
            System.out.println(e.getEmpid()+" "+e.getAge()+" "+e.getEname());

        }
    }
}
