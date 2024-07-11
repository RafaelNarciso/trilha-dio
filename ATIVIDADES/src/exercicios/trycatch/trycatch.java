package exercicios.trycatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

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

            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos Idade e alturas precisam ser numericos");
        }

    }
}
