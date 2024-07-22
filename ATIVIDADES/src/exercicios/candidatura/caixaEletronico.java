package exercicios.candidatura;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exercicios.trycatch.trycatch;

public class caixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            menu();

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.

                    boolean depositos = true;

                    while (depositos) {
                        try {
                            System.out.printf("Informe o valor a ser Depositado : ");
                            double depositado = scanner.nextDouble();
                            scanner.nextLine();

                            if (depositado > 0) {
                                saldo += depositado;
                                System.out.println("Saldo atual : " + String.format("%.1f", saldo));

                            } else {
                                System.out.println("Valor invalido, por favor insira um valor positivo:");
                            }

                            System.out.printf("\nGostaria de realizar um novo deposito :S = Sim, N = Não (S/N) : ");
                            String novoDeposito = scanner.nextLine().toUpperCase();

                            if (novoDeposito.equals("N")) {
                                depositos = false;
                                System.out.println("\nSaldo atual : " + String.format("%.1f", saldo));
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("\n=====================================================\n");
                            System.out.println("Informe os Valores corretos ");
                            scanner.nextLine();
                            System.out.println("Saldo atual : " + String.format("%.1f", saldo));
                            System.out.println("\n=====================================================\n");

                        }

                    }

                    break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    boolean sacar = true;
                    while (sacar) {

                        try {
                            System.out.printf("Informe o valor que gostaria de Sacar : ");
                            double saque = scanner.nextDouble();
                            scanner.nextLine();

                            if (saque > 0 && saque <= saldo) {
                                saldo -= saque;
                                System.out.println("Saldo atual:" + String.format("%.1f", saldo));
                            } else if (saque <= 0) {

                                System.out.println("Valor inválido, por favor insira um valor positivo.");

                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            System.out.println("\n=====================================================\n");
                            System.out.printf("\nGostaria de realizar um novo SAQUE : S = Sim, N = Não (S/N) : ");
                            String novoSaque = scanner.nextLine().toUpperCase();
                            System.out.println("\n=====================================================\n");
                            if (novoSaque.equals("N")) {
                                sacar = false;
                                System.out.println("\n=====================================================\n");
                                System.out.println("Saldo atual:" + String.format("%.1f", saldo));
                                System.out.println("\n=====================================================\n");
                            }

                        } catch (InputMismatchException e) {

                            System.out.println("\n=====================================================\n");
                            System.out.println("Informe os Valores corretos ");
                            scanner.nextLine();
                            System.out.println("Saldo atual:" + String.format("%.1f", saldo));
                            System.out.println("\n=====================================================\n");

                        }

                    }

                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("\n=====================================================\n");
                    System.out.println("Bem-Vindo ao Consulta Saldo : ");
                    System.out.println("Saldo atual:" + String.format("%.1f", saldo));
                    System.out.println("\n=====================================================\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
        scanner.close();

    }

    static void menu() {
        String menuDeEntrada = """
                ==========================================
                      Bem vindo ao caixa eletrônico
                             1 - Depositar
                             2 - Sacar
                             3 - Consultar Saldo
                             0 - Encerrar
                ==========================================

                        """;
        System.out.println(menuDeEntrada);

    }

    /**
     * System.out.println("==========================================");
     * System.out.println(" Bem-vindo ao caixa eletrônico");
     * System.out.println(" 1 - Depositar");
     * System.out.println(" 2 - Sacar");
     * System.out.println(" 3 - Consultar Saldo");
     * System.out.println(" 0 - Encerrar");
     * System.out.println("==========================================");
     */

}
