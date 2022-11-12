package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
	}

}
