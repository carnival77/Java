package com.app2;

import com.app2.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203", 500000, 0.073);
		System.out.println(account.toString());
		account.withdraw(600000);
		account.deposit(20000);
		System.out.println(account.toString());
		System.out.printf("����: %.1f", account.calculateInterest());

	}
}
