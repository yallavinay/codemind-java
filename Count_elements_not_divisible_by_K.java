import java.util.*;
public class sample
{
    public static int countelement(int [] arr,int k)
    {
        int count=0;
        for(int i:arr)
        {
            if(i%k!=0)
            {
                count++;
            }
        }
       return count;
    }
     public static void main(String args[])
     {
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result =countelement(arr,k);
        System.out.println(result);
         
     }
}