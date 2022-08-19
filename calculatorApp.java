import java.util.Scanner;

public class calculatorApp {

	public static void main(String[] args) {
		
		int n1 , n2 , select , result;
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter first number: ");
			n1 = input.nextInt();
			System.out.print("Enter second number: ");
			n2 = input.nextInt();
			
			System.out.println("1-) Addition");
			System.out.println("2-) Extraction process");
			System.out.println("3-) Multiplication");
			System.out.println("4-) Section");
			select = input.nextInt();
		}
		
		switch(select) {
		case 1:
			result = n1+n2;
			System.out.println("Result: " + result);
		break;
		
		case 2:
			result = n1-n2;
			System.out.println("Result: " + result);
		break;
		
		case 3:
			result = n1*n2;
			System.out.println("Result: " + result);
		break;
		
		case 4:
			result = n1/n2;
			System.out.println("Result: " + result);
		break;
		default: System.out.println("Please select a valid transaction");
		break;
		}
	}

}
