package org.banco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, insira o número da Agência!: ");
        int agencia = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, insira o seu nome: ");
        String cliente = sc.nextLine();

        System.out.print("Por favor, insira a conta: ");
        String conta = sc.nextLine();

        System.out.print("Por favor, insira o saldo: ");
        BigDecimal saldo = new BigDecimal(sc.nextLine());

        System.out.println("\nConta criada!");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
        "sua agência é %s, conta %s, e seu saldo %.2f\n", cliente, agencia, conta, saldo);
    }
}
