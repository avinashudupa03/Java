package ssstack;

public class t1 {
     int stack[]=new int[5];
     int top=-1;
     void push(int data)
     {
         top++;
         stack[top]=data;
     }
     int pop()
     {
         if(top==-1)
         {
             return -1;
         }
         int value= stack[top];
         top--;
         return value;
     }
     void display()
     {
         for(int i=top;i>=0;i--)
         {
             System.out.println(stack[i]);
         }
     }
     int peek()
     {
         if(top==-1)
         {
             System.out.println("empty........");
             return -1;
         }
         int value=stack[top];
         return value;
     }

    public static void main(String[] args) {
        t1 s=new t1();
        s.push(60);
        s.push(70);
        s.push(80);
        s.display();
        s.push(10);
        s.push(66);
        s.pop();
        s.peek();
        s.display();
    }
}
