import java.util.Scanner;
public class squarepattern2 {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(""+j);
            }
            System.out.print("\n");
        }

    }
    
}
