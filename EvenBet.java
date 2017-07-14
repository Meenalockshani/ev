import java.util.*;
import java.io.*;
public class EvenBet

{
public static void main(String[] args)throws IOException
{
  
 int n;
 int g;
   BufferedReader ap=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("first number");
n=Integer.parseInt(ap.readLine());
System.out.println("second number");

g=Integer.parseInt(ap.readLine());
while(n<g){
 
 if(n%2==0)
 {
 System.out.println(n);
 
 }
 n=n+1;
}
}
}
