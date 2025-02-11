package com.bancodigital;

public class OpenAccount extends Account {

	public OpenAccount(Costumer costumer) {
		super(costumer);
	}

	@Override
	public void printAccountStatement() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.printInfo();
	}
	
}
