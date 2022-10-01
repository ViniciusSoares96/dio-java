package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por Favor, digite seu nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o numero de sua conta!");
        int conta = sc.nextInt();
        System.out.println("Por favor, digite o numero de sua Agencia!");
        sc.next();
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite seu deposito");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", e seu saldo é " + saldo + " já esta disponivel papa saque");
    }
}
