import java.util.HashMap;

public class CountNumberOfOccuranceOfaWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str= "new orphan new journey orphan orphan new ";
		
		String str1[]= str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(String search :str1) {
			if(map.containsKey(search)) {
				map.put(search, map.get(search)+1);
				//count++;
			}else {
				map.put(search, 1);
			}
			
			
			}
			System.out.println(map);
		}
		
	}


