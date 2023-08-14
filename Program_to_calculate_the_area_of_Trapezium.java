import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int b1,b2,h;
        b1=sc.nextInt();
        b2=sc.nextInt();
        h=sc.nextInt();
        double a= (b1+b2)*h*0.5;
        System.out.format("%.4f",a);
    }
}