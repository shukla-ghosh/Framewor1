import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class StringPrograms {
	
	String str="My name is Shukla";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(li.size());

	}
	

}
