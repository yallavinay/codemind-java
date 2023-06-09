import java.util.*;
public class average
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,sum=0,flag=0;
        float avg;
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
          sum= sum+arr[i];
        }
         avg=sum/n;
         for(int i=0;i<n;i++)
         if(arr[i]==avg)
         {
             flag=1;
             break;
         }
         else
         {
             flag=0;
         }
         if(flag==1)
         {
             System.out.println("True");
         }
         else
         {
             System.out.println("False");
         }
    }
}