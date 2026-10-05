package ssstack;

public class t4 {
    int queue[];
    int front;
    int rear;
    int capacity;
    int size;
    public t4(int capacity){
        this.capacity=capacity;

    }
    void add(int data)
    {
        if(size==capacity) {
            System.out.println("full");
            return;
        }
        rear =(rear+1)%capacity;
        queue[rear]=data;
        size++;
    }
    int poll()
    {
        if(size==0)
        {
            System.out.println("empty");
            return -1;
        }
        int value=queue[front];
        queue[front]=-1;
        front=(front+1)%capacity;
        size--;
        return value;
    }
    void display()
    {
        for(int i=0;i<=capacity-1;i++)
        {
            if(queue[i]==-1)
            {
                System.out.println("-"+" ");
            }
            else {
                System.out.println(queue[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}