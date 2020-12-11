package entities;

public class Conta_bancaria {
	
	private int bank_account_number;
	private String user_name;
	private double balance;
	
	public Conta_bancaria() {
	}
	
	public Conta_bancaria(int bank_account_number, String user_name, double initialDeposit) {
		this.bank_account_number = bank_account_number;
		this.user_name = user_name;
		deposit_value(initialDeposit);
	}
	
	public Conta_bancaria(int bank_account_number, String user_name) {
		this.bank_account_number = bank_account_number;
		this.user_name = user_name;
	}

	public int getBank_account_number() {
		return bank_account_number;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit_value (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= (amount + 5);
	}
	
	public String toString() {
		return "Account "+ bank_account_number 
				+", Holder: " + user_name 
				+ ", Balance: $ " + String.format("%.2f", balance);
	}

}
