package model.entities;

import model.exceptions.WithdrawException;

public class BankAccount {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public BankAccount(int number, String holder, double balance, double withdrawLimit) {
		if(balance < 0 || withdrawLimit < 0) {
			throw new RuntimeException("The balance must be greater than zero!");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double value) {
		if(value < 0) {
			throw new RuntimeException ("The value most be above zero!");
		}
		balance += value;
	}
	
	public void withdraw(double value) {
		if(value > balance) {
			throw new WithdrawException ("insufficient funds!");
		}
		else if(value > withdrawLimit) {
			throw new WithdrawException ("The amount must be less than the withdrawal limit!");
		}
		else {
			balance -= value;
		}
	}

	public String toString() {
		return "Account: "+ number 
				+", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance);
	}

}
