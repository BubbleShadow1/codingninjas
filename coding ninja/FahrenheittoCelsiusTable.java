import java.util.Scanner;
public class FahrenheittoCelsiusTable {
    public static void fahrenheitcelsius(int S,int E,int W)
    {
        for(int i=S;i<=E;i=i+W)
        {
            System.out.printf("%d\t",i);
            int f=i;
            int c=((f-32)*5)/9;
            System.out.printf("%d",c);
            System.out.print("\n");


        }
        


    } 
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        
        fahrenheitcelsius(S, E, W);


    }
    
}
