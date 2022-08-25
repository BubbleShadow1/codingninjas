import java.util.Scanner;
public class triangularpattern {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+(j+1));
            }
            System.out.print("\n");
        }
    }
    
}
