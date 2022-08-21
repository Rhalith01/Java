import java.util.Scanner;

public class atmApp {

	public static void main(String[] args) {

		int balance = 0, select, amount;
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i >= i; i++) {
				System.out.println("******  ATM MENU  ******");
				System.out.println();
				System.out.println("1-) Balance inquiry");
				System.out.println("2-) To deposit money");
				System.out.println("3-) Withdraw money");
				select = input.nextInt();

				switch (select) {
				case 1:
					System.out.println("Current balance: " + balance);
					break;

				case 2:
					System.out.print("The amount of money you want to deposit: ");
					amount = input.nextInt();
					balance = balance + amount;
					if (amount < 0) {
						System.out.println("Enter a valid amount");
					} else {
						System.out.println("Your deposit is complete. Your current balance: " + balance);
					}
					break;

				case 3:
					System.out.print("Enter the amount of money you want to withdraw: ");
					amount = input.nextInt();
					if (amount < 0 || amount > balance) {
						System.out.println("Enter a valid amount");
					} else {
						System.out.println("Your withdrawal is complete, your current balance: " + balance);
						balance = balance - amount;
					}
				}

			}
		}

	}
}
