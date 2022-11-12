package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
nameList.add("Java");
nameList.add("Python");
nameList.add("Ruby");

synchronized(nameList) {
	Iterator<String> it=nameList.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
	}

}
