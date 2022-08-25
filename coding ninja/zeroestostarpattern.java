import java.util.Scanner;
public class zeroestostarpattern {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int y=n;
        int r=1;
        for(int j=0;j<n;j++){
        
            int p=0;
            while(p>j)
            {
                if(j==0)
                {

                }
                else{
                System.out.print("*");
            }
            
        }
                   System.out.print("*");
        
        
        
        
    for(int i=0;i<n-1;i++)
        {
            System.out.print("0");
        }

                   System.out.print("*");


        for(int k=0;k<n-1;k++)
        {
            System.out.print("0");
        }



        System.out.print("*");





           System.out.print("\n"); 

        }
        
        
    }
}

