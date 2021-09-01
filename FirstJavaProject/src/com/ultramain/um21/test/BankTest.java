package com.ultramain.um21.test;

import com.ultramain.um21.javabasics.Bank;

public class BankTest {
	public static void main(String[] arg){
		Bank.bankName="icici";
		
		Bank user1=new Bank();
		
		user1.accountNumber="654578f";
		user1.userName="Gopi";
		user1.bankBalance=6000;
		user1.depositedAmount=2000;
		user1.viewBalance("654578f");
		user1.viewBankBalance(6000, 2000);
	}

}