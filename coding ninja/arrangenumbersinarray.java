import java.util.Scanner;
public class arrangenumbersinarray {
    public static void arrange(int[] arr, int n) {
    	
        arr=new int[500000];
        int i=0;
        while(i<n)
        {
            int p=i+1;
            int w=((2*p)-1);
            if(w>=n)
            {
                break;
            }
            arr[i]=w;
            System.out.printf("%d ",w);
            i++;



        }
        i=i--;
        arr[i]=n;
        i++;
        System.out.printf("%d ",n);
        int j=0;
        if(n%2==0)
        {
            j=n-2;
        }
        else if(n%2!=0)
        {
            j=n-1;
        }
        while(j>=2)
        {
           arr[i]=j;
            System.out.printf("%d ",j);
            j=j/2;
            i++;

        }


    }
    public static void main(String arg[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int [5000];
    arrange(arr,n);

}
  


    }
    
