package LinkedList;

interface nsam{
    void cal(int a,int b);
}

public class sample2 {
    public static void main(String[] args) {
         nsam n=(int a,int b)->{
             System.out.println("Sum: "+(a+b));
         };
         n.cal(10,20);
         nsam n1=(int a,int b)->{
             System.out.println("Diff : "+(a-b));
        };
         n1.cal(10,20);
        nsam n2=(int a,int b)->{
            System.out.println("Product : "+(a*b));
        };
        n2.cal(10,20);
        nsam n3=(int a,int b)->{
            System.out.println("Division: "+(a/b));
        };
        n3.cal(10,20);
    }

}
