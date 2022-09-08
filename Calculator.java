import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		
		int operationtype = sc.nextInt();
	switch(operationtype)
	
	
		{
			case 1:System.out.println(a+b);break;
			case 2:System.out.println(a-b);break;
			case 3:System.out.println(a*b);break;
			case 4:System.out.println(a/b);break;
			default:System.out.println("Invalid Operationtype");
			
		}
		
		
	}

}
