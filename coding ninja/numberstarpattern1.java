import java.util.Scanner;
public class numberstarpattern1 {
   
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else{
                System.out.print(j); 
                }
                
            }
            System.out.print("\n");

        } 

    }
    
}
