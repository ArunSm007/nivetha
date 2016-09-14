package aa;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class longmin {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i;
		 int count=0;
		 int k=0;
		for(i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
			if(i%j!=0)
			{
				count++;
			}
			
			}
		}
			System.out.println(count);
			}
}
