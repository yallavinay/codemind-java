import java.util.*;
 public class element
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,key,flag=0,i=0;
        n=sc.nextInt();
      int arr[]= new int[n];
        for( i=0;i<n;i++ )
        {
            arr[i]=sc.nextInt();
        }
        key=sc.nextInt();
        for(i=0;i<n;i++)
        
        if(arr[i]==key)
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