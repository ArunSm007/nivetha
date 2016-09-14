package aa;
import java.util.*;
public class longmin {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] s=new int[a];
		int[] c=new int[a];
		int i;
		for(i=0;i<s.length;i++)
		{
			s[i]=sc.nextInt();
		}
Arrays.sort(s);
for(int j=0;j<s.length;j++)
{
		System.out.println(s[j]);
			}
}
}
