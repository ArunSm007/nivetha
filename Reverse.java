import java.util.*;
public class Reverse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=new StringBuffer(s).reverse().toString();
System.out.println(s1);
}
}
