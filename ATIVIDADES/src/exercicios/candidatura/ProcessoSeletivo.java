package exercicios.candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Augusto", "Paulo" };
        for (String candidato : candidatos) {
            entrandoEmcontado(candidato);
        }

    }

    static void entrandoEmcontado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("\nContato realizado com sucesso \n");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println(
                    "\nCONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS \n");
        } else {
            System.out.println("\nNÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS "
                    + tentativasRealizadas + "\n");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionado() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Augusto", "Paulo" };

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " e " + candidatos[indice]);
        }

        System.out.println("\n\tForma abreviada de interação :\n");
        int indices = 0;
        for (String candidato : candidatos) {
            indices++;
            System.out.println("O candidato de " + (indices) + " e " + candidato + " foi selecionado ");
        }

    }

    static void selecaoCandidato() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Augusto", "Paulo", "Monica", "Fabricio", "Mirela",
                "Daniela",
                "Jorge", "Rafael" };
        int candidadoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidadoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPrendido();

            System.out.printf(
                    "\nO candidado " + candidato + " Solicitou este valor de salário R$ %.1f ",
                    salarioPretendido, "\n");

            if (salarioBase >= salarioPretendido) {

                System.out.println("\n\tO candidato " + candidato + " foi selecionado para vaga \n");
                candidadoSelecionado++;
            }
            candidatoAtual++;

        }
    }

    static double valorPrendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {

            System.out.println("Aguardando o Resultado demais candidatos");
        } else {
            System.out.println("Ligar para o candidado com contra proposta ");
        }
    }

}
