package java.util;

public class scanner {
	public static void main(String[]args){
		System.out.println("enter a word/string");
		Scanner scan=new Scanner(System.in);
		String number= scan.nextLine();
		System.out.println(answer(number));
	}
			public static boolean answer(String one){
				int two=one.length();
				if(two%2==0){
					return true;
					 
				}else{
					return false;
							
					
				}
				
				
		}
			
		
		
	}


