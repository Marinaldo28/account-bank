package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta_bancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta_bancaria account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there initial deposit (y/n)? ");
		char enter = sc.next().charAt(0);
		
		if(enter == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta_bancaria(number, name, initialDeposit);
		} else {
			account = new Conta_bancaria(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit_value(depositValue);
		
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
