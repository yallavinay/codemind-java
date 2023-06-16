import java.util.*;
public class Between
{
    public static void main(String args[])
    {
        int n,a,b,c=0;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<a||arr[i]>b)
            {
                c++;
            }
        }
        if(c>0)
        {
            for(int i=0;i<arr.length;i++)
                if(arr[i]<a||arr[i]>b)
                {
                    System.out.print(arr[i]+" ");
                }
        }
        else 
        {
            System.out.println("-1");
        }
    }
}