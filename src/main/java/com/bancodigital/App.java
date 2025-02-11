package com.bancodigital;

public class App {
    public static void main( String[] args ) {
			Costumer venilton = new Costumer();
			venilton.setName("Venilton");
			
			Account oa = new OpenAccount(venilton);
			Account sa = new SavingsAccount(venilton);
			
			oa.deposit(100);
			oa.transfer(100, sa);
			oa.printInfo();
			oa.printAccountStatement();
			sa.printAccountStatement();
    }
}
