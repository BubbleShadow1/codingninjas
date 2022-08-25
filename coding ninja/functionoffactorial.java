import java.util.Scanner;
public class functionoffactorial {
    public static int main(int n)
    {
        
        int fact=1;
       
        while(n>0)
        {
            fact=fact*n;
            n--;
            
        }
        System.out.printf("%d",fact);
        return fact;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
     System.out.printf("%d",main(t));   
     


    }
    
}
