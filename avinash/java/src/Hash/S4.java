package Hash;

public class S4 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        for (int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            for( i=0;i<a.length-1;i++)
            {
                    System.out.println("Sorted Array: "+a[i]);
            }
        }
    }
}
