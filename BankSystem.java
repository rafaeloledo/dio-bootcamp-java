import java.util.Scanner;

abstract class Conta {
  protected double saldo;

  public Conta(double saldo) {
    this.saldo = saldo;
  }

  public abstract void sacar(double valor);

  public void exibirSaldo() {
    System.out.printf("Saldo Atual: %.2f%n", saldo);
  }
}

class ContaCorrente extends Conta {
  private double limite;

  public ContaCorrente(double saldo, double limite) {
    super(saldo);
    this.limite = limite;
  }

  @Override
  public void sacar(double valor) {
    if ((saldo - valor) >= -limite) {
      System.out.printf("Saque realizado: %.2f\n", valor);
      saldo -= valor;
    } else {
      System.out.printf("Saque invalido: Excede limite\n");
    }

    exibirSaldo();
  }
}

class ContaPoupanca extends Conta {

  public ContaPoupanca(double saldo) {
    super(saldo);
  }

  @Override
  public void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
    } else {
      System.out.printf("Saque invalido: Saldo insuficiente\n");
    }

    exibirSaldo(); // Exibe o saldo atualizado
  }
}

public class BankSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.print("Tipo de conta: ");
    String tipoConta = scanner.nextLine();
    // System.out.print("Nome: ");
    String nome = scanner.nextLine();
    // System.out.print("Numero da conta: ");
    String numeroConta = scanner.nextLine();
    // System.out.print("Saldo inicial: ");
    double saldoInicial = scanner.nextDouble();

    Conta conta = null;

    if (tipoConta.equalsIgnoreCase("corrente")) {
      // System.out.print("Digite o valor do limite para cheque especial: ");
      double limite = scanner.nextDouble();
      conta = new ContaCorrente(saldoInicial, limite);
    }

    if (tipoConta.equalsIgnoreCase("poupança") || tipoConta.equalsIgnoreCase("poupanca")) {
      conta = new ContaPoupanca(saldoInicial);
    }

    // System.out.print("Digite o valor do saque: ");
    while (scanner.hasNextDouble()) {
      double valorSaque = scanner.nextDouble();
      // System.out.printf("Sacando %f da conta que possui %f de saldo\n", valorSaque,
      // conta.saldo);
      conta.sacar(valorSaque);
    }

    scanner.close();
  }
}
