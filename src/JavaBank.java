import java.util.Scanner;

public class JavaBank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao;

        do {
            System.out.println("\n=================================");
            System.out.println("   JAVABANK - CAIXA ELETRÔNICO");
            System.out.println("=================================");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Sacar dinheiro");
            System.out.println("4 - Sair");
            System.out.println("=================================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Valor de saque inválido.");
                    } else if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o JavaBank!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}