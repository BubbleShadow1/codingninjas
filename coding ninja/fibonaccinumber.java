import java.util.Scanner;
public class fibonaccinumber{
public static boolean function(int n)
{
    int t1=0,t2=1,nextterm;
        for(int i=0;i<10000;i++)
        {
            if(t1==n)
            {
                return true;
            }
            nextterm=t1+t2;
            t2=t1;
            t1=nextterm;
            
        }
        return false;
}

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.printf("%b",function(n));
        

    }
    
}
