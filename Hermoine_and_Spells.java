import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>c && b>c)
        {
            System.out.println(a+b);
        }
        else if(b>a && c>a)
        {
            System.out.println(b+c);
        }
        else
        {
            System.out.println(c+a);
        }
        
    }
}