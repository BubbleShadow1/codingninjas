import java.util.Scanner;
public class countheword {
    public static int countWords(String str) {	
		int size=str.length();
        int word=1;
        if(str="")
        {
            return 0;
        }
        for(int i=0;i<size;i++)
        {
            
           
            int p=str.charAt(i);
            if(p==' ')
            {
                word++;

            }
        }
        return word;
	}



    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
		String str =s.nextLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count =countWords(str);
		System.out.println(count);
	}
}
    
