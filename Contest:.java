import java.util.*;
public class sample{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int x,e,h;
        x=sc.nextInt();
        e=sc.nextInt();
        h=sc.nextInt();
        int t=((1*e)+(2*h));
        if(t>=x)
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("Not Qualify");
        }
    }
}