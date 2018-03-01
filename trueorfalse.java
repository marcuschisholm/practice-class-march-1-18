import java.util.Scanner;

public class trueorfalse {
	public static void main(String[]args){
	Scanner Scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=Scanner.nextInt();
		if(number%2==0){
			if(number%3==0){
				System.out.println("true");
			}
		}else {
			System.out.println("false");
		}
	
	}
}
