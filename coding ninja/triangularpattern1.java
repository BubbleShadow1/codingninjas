import java.util.Scanner;
public class triangularpattern1 {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        int h=1;
        int p=0;
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==2)
            {
                k=i;
            }
            else 
            {
                k=p+h;
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(" "+k);
                p=k;
                k++;
                

            }
            System.out.print("\n");


        }
        
    }
    
}
