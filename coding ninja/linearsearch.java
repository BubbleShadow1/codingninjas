import java.util.Scanner;
public class linearsearch{

    public static int linearSearch(int arr[], int x) {
     int p=0;
     int h=0;
     int size=arr.length;
     for(h=0;h<size;h++)
     {
        
        if(arr[h]==x)
        {
          System.out.println(h);
          
          p++;
          return h;
          
        
    }
}
if(p==0){
            System.out.println("-1");
return -1;
        }

    }
    
 
    
    
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    int arr[]=new int[5000];
        for(int i=0;i<n;i++)
        {
            int x=s.nextInt();
            for(int j=0;j<x;j++)
            {
            arr[j]=s.nextInt();
                
            }
            int r=s.nextInt();
            linearSearch(arr,r);
            

        }

    
    
    }
    
}