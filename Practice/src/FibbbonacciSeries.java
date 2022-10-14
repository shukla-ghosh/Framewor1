import java.util.Scanner;

public class FibbbonacciSeries {
	public static void calculatefibbonacci(int n) {
		int x=0;
		int y=1;
	int z=0;
		
		for(int i=0;i<=n;i++) {
			System.out.print(z+" ");
			z=x+y;
			x=y;
			y=z;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
	
		calculatefibbonacci(num);
		sc.close();
		
	}

}
