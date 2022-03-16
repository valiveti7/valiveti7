package treeset;
import java.util.*;
public class morning_session_as1 {
	public static void main(String args[]) {
			ArrayList al=new ArrayList();
					al.add("valiveti");
					al.add("sriram");
					al.add("kumar");
			Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				itr.remove();
			}
		TreeSet ts=new TreeSet();
		ts.add("i");
		ts.add("i's son");
		ts.add("i's daughter");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter here:");
		for (int i=0;i<3;i++) {
			ts.add(sc.nextLine());
		}
		sc.close();
		System.out.println(ts.first());
		System.out.println(ts.last());
		}
}
