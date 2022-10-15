package Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"Ram", "Shyam","Alex"};
	String[] strnew=new String[3];
	int k=0;
		for(int i=str.length-1;i>=0;i--) {
			strnew[k++]=str[i];
			
		}
		for(int j=0;j<=strnew.length-1;j++) {
		 System.out.println(strnew[j]);
		}
	}

}
