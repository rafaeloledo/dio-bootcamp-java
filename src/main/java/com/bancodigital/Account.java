package com.bancodigital;

public abstract class Account implements IAccount {
	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENTIAL_NO = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Costumer costumer;

	public Account(Costumer costumer) {
		this.agency = DEFAULT_AGENCY;
		this.number = SEQUENTIAL_NO;
		this.costumer = costumer;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, IAccount destAccount) {
		this.withdraw(value);
		destAccount.deposit(value);
	}

	public int getAgency() {
		return this.agency;
	}

	public int getNumber() {
		return this.number;
	}

	public double getBalance() {
		return this.balance;
	}

	public void printInfo() {
		System.out.printf("Titular: %s\n", this.costumer.getName());
		System.out.printf("Agência: %d\n", this.agency);
		System.out.printf("Número: %d\n", this.number);
		System.out.printf("Saldo: %f\n", this.balance);
	}
}
