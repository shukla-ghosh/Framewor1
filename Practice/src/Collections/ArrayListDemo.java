package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add(100);
		
		System.out.println(ar);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(400);
		ar.add(300);
		System.out.println(ar);
		
		//lamda expression to print all of the values in arrayList
		
		ar.stream().forEach(ele ->System.out.println(ele));
		//to get the distinct values
		
		List<Object> listwithoutDuplicates=ar.stream().distinct().collect(Collectors.toList());
		System.out.println(listwithoutDuplicates);
	}

}
