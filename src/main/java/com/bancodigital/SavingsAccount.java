package com.bancodigital;

public class SavingsAccount extends Account {

	public SavingsAccount(Costumer costumer) {
		super(costumer);
	}

	@Override
	public void printAccountStatement() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printInfo();
	}
}
