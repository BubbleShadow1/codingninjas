import java.util.Scanner;
import java.lang.Math;

public class checkarmstrong {
    public static int  power(int base,int exponent) {

        
    
        int result = 1;
    
        for (; exponent != 0; --exponent) {
          result *= base;
        }
    
        return result;
      }


    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int p=n;
        int sum=0;
        int t;
        int k=0;
        while(n>0)
        {
            k++;
            n=n/10;
        }
       n=p;
while(n>0)
{
        t=n%10;
        sum+=power(t,k);
        System.out.print("\n");
        n=n/10;
    }
    if(sum==p)
    {
        System.out.print(true);
    }
    else{
        System.out.print(false);
    }
    }    
}
