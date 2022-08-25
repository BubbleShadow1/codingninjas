import java.lang.String;
import java.util.Scanner;
public class string {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str="hello world";
        System.out.print(str.charAt(0));

        String str2="";      //empty string
        System.out.print(str2.length());

        String str3=" ";   //this is not a empty set it is a string with 1 length.
      System.out.printf("%c %d",str3.charAt(0),str3.length());
        System.out.print(str3.length());
        System.out.print(str3.charAt(0));
        int p=str3.length();
        System.out.print(p);

String str4="wing";
        //lets use some funtions .
System.out.print(str.concat(str4)); //concatenation
System.out.print(str.equals(str4));
System.out.print(str.compareTo(str4));
        System.out.print(str.substring(3));
System.out.print(str.substring(1,11)); //here the end index value is length of string above this value index became out of bound error


String a=s.next();
String b=s.nextLine();


System.out.println(a+" "+a.length());
System.out.println(b+" "+b.length());

//String f="coding";
//for(int i=2;i<4;i++)
//{
  //  System.out.print(f.substring(i));
//}

String t="coding";
for(int i=2;i<5;i++)
{
    System.out.print(t.substring(i-2,i+1));
}
        

String o="abcd";
String e="abcda";
System.out.println(o.compareTo(e));



    }
    
}
