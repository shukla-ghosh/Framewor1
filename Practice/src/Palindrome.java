import java.util.Scanner;

public class Palindrome {
// A number is called palindrome when reversing the number is same as the previous (Ex : 121)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int num1=num;
		int reversednumber=0;
		while(num1>=1) {
			 reversednumber=reversednumber*10+num1%10;
			 num1=num1/10;	 
		}
		 if(reversednumber==num) {
			 System.out.println("Number is palindrome");
		 }else {
			 System.out.println("Number is not palindrome"); 
		 }
	}

}
