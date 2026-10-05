package ssstack;

import java.util.Queue;

public class t3 {
   int front;
   int queue[];
   int rear;
   int capacity;
   public t3(int capacity)
   {
       this.capacity=capacity;
       queue=new int[capacity];
       front=0;
       rear=-1;
   }
   void add(int data)
   {
       if(rear ==capacity-1)
       {
           System.out.println("full...");
       }
       rear++;
       queue[rear]=data;
   }
   int poll()
   {
       if(front>rear)
       {
           System.out.println("empty....");

           return -1;
       }
       int value=queue[front];
       front++;
       return value;
   }
   int peek()
   {
       if(front>rear)
       {
           System.out.println("empty.....");
       }
       int value=queue[front];
       return value;
   }
   void display()
   {
       for(int i=front;i<=rear;i++)
       {
           System.out.println(queue[i]+" ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
       t3 q=new t3(5);
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.display();
       q.add(90);
       q.peek();
       q.display();
    }
}
