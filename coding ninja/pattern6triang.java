public class pattern6triang {
    public static void main(String arg[])
    {
        int i,k=1;
        for(i=0;i<4;i++)
        {
        
          for(int j=i;j<i+k;j++)
           {
             
        System.out.printf("%d",j+1);
            
           }
           k++;
           System.out.printf("\n");
        }
    }
    
}
