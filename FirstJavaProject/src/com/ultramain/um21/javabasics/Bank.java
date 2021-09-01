package com.ultramain.um21.javabasics;

public class Bank {
	public static String bankName;
	public String accountNumber;
	public String userName;
	public int amount;
	public int bankBalance;
	public int depositedAmount;
	
	public int getDepositedAmount() {
		return depositedAmount;
	}
	public void setDepositedAmount(int depositedAmount) {
		this.depositedAmount = depositedAmount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public void viewBankBalance(int bankBalance, int depositedAmount){
		int balance = bankBalance + depositedAmount;
		System.out.println("Bank Balance=" + balance);
	}
		
		public void viewBalance(String AccountNumber){	
			System.out.println("Bank Name=" + bankName);
			System.out.println("Account number=" + AccountNumber);
			System.out.println("User Name=" + userName);
			System.out.println("Bank Balance=" + bankBalance);
			System.out.println("Deposited Amount=" + depositedAmount);
			}
	
}
