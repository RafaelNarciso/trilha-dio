package exercicios.trycatch;

import java.util.Locale;
import java.util.Scanner;

public class testando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao sistema de perguntas :");
        System.out.println("Caso queira entrar informe ' S=SIM ou N=NÃO '     (S/N)");
        String resposta = sc.nextLine();

        while (resposta.equalsIgnoreCase("S")) {

            System.out.println("Digite seu Nome : ");
            String nome = sc.nextLine().trim();

            System.out.println("Digite seu Sobrenome : ");
            String sobrenome = sc.nextLine().trim();

            System.out.println("Informe sua idade : ");
            int idade = sc.nextInt();

            System.out.println("Informe a sua altura : ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println("=====================================================================");
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            System.out.println("=====================================================================");

            System.out.println("Deseja sair do sistema : (S/N)");
            String entrada = sc.nextLine().toUpperCase();
            System.out.println();
            if (entrada.equals("S")) {
                System.out.println("Obrigado!!!");
                break;
            }
            System.out.println("Caso queira entrar informe ' S=SIM ou N=NÃO '     (S/N)");
            resposta = sc.nextLine();

        }

        sc.close();

    }
}
