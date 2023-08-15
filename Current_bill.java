import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double n,b;
        n=sc.nextDouble();
        if(n<=199)
        
            b=n*1.20;
        
        else if(n>=200 && n<400)
        
            b=n*1.50;
        
        else if(n>=400 && n<600)
        
            b=n*1.80;
        
        else
        
            b=n*2.00;
        
        
        if(b>400)
        {
            b=b+(b*0.15);
        }
        else
        {
            b=b+100;
        }
        System.out.format("%.2f",b);
    }
}