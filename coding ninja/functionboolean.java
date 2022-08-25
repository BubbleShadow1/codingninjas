import java.util.Scanner;
public class functionboolean {
    public static boolean isprimeornot(int n)
    {
        for(int i=1;i<=9;i++)
        {
            if(n>0)
            {
            if(i==n)
            {
                continue;
            }
            else if(n==1)
            {
                
            return false;

            }
            else if(i==1)
            {
                continue;
            }
            else if(n%i==0)
            {
                return false;
            }
        }
        else 
        {
            System.out.print("the given no. is not prime .");

        }

        }
        return true;
       
        


    }
    
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.printf("%b",isprimeornot(n));
        

    }
}
