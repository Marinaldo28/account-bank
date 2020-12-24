package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BankAccount;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			BankAccount bk = new BankAccount(number, holder, balance, withdrawLimit);
			System.out.println();
			System.out.println("Atual Account:");
			System.out.println(bk);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double value = sc.nextDouble();
			bk.withdraw(value);
			
			System.out.println();
			System.out.println("Update Account:");
			System.out.println(bk);
		}
		catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
		
		sc.close();
	}

}
