package com.app3;

import java.nio.channels.AcceptPendingException;

public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		double result = 0;
		result = this.balance * this.interestRate;
		return result;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}

	public void deposit(double money) throws AccountException {
		try {
			if (money < 0) {
				throw new AccountException("�Ա� �ݾ��� 0���� �����ϴ�.");
			} else {
				this.balance += money;
			}
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			// TODO: handle
		}
	}

	public void withdraw(double money) throws AccountException {
		try {
			if (balance < money) {
				throw new AccountException("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
			} else {
				this.balance -= money;
			}
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			// TODO: handle
		}
	}

}
