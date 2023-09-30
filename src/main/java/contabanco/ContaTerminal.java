package contabanco;

import java.util.Scanner;

public class ContaTerminal {

    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    private static void mensagemPadrao(int numero, String agencia, String nomeCliente, double saldo){

        System.out.printf(
                "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque"
                    ,nomeCliente,agencia,numero,saldo);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência !");
        agencia = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite o seu nome:  ");
        nomeCliente = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        mensagemPadrao(numero,agencia,nomeCliente,saldo);
        sc.close();
    }



}
