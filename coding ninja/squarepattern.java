import java.util.Scanner;
public class squarepattern
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
int i=0;
        while(i<n)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+(i+1));

            }
System.out.print("\n");
i++;
        }

    }
}