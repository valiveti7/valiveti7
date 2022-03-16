package primaryusage;
import java.util.*;
public class primarypurpose {
	public static void main(String[] args)
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println("Addition of two numbers:"+c);
		
		ArrayList l = new ArrayList();
		l.add("111");
		l.add("444");
		l.add("333");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
	}
}
