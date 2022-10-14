import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
	findDuplicateChars(name);

	}
	
 static public void findDuplicateChars(String str) {
	for(int i=0;i<=str.length()-1;i++) {
		for(int j=i+1;j<=str.length()-1;j++) {
			if(str.charAt(j)==str.charAt(i)) {
				System.out.print(str.charAt(j));
				//str.charAt(j)='0';
			}
		}
	}
	
	
}
}
