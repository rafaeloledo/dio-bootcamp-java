import java.util.Scanner;

public class BankSystem {
	private String titular = "";
	private int numeroConta = 0;
	private double saldo = 0.0;

	public BankSystem(String titular, int numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= saldo) {
			saldo -= valorSaque;
			return true;
		}

		return false;
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}

	public double consultarSaldo(){
		return saldo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titular = sc.nextLine();
		int numeroConta = sc.nextInt();
		double saldoInicial = sc.nextDouble();
		BankSystem conta = new BankSystem(titular, numeroConta, saldoInicial);

		if (sc.hasNextDouble()) {
			double valorSaque = sc.nextDouble();
			if (!conta.sacar(valorSaque)) {
				System.out.println("Saque invalido: Saldo insuficiente");
				System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
				return;
			}
		}

		if (sc.hasNextDouble()) {
			double valorDeposito = sc.nextDouble();
			conta.depositar(valorDeposito);
		}

		System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

		sc.close();
	}
}
