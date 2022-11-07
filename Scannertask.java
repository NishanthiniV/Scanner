package name;

import java.util.Scanner;

public class Scannertask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vjn;
		String nis =new String();
		
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())  {
			
			System.out.println("enter the string");
			vjn = scan.nextLine();
			 
			if (vjn.equals("exit")) {
				
				break;
			}
			
			nis+= vjn;
		}
		System.out.println("string exited" +nis);			
		}

	}
		
	


