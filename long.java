package aa;
import java.util.*;
public class longmin {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		switch(s)
		{
		case "monday":
		case "tuesday":
		case "wednessday":
		case "tursday":
		case "friday":
		case "saturday":
			System.out.println("true");
			break;
		case "sunday":
			System.out.println("false");
			break;
			default:
			System.out.println("enter week days only");
		}
			}
}
