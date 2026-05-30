package Conteúdos_e_Exercícios;

import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;
        int totalNotas = 0;


    while (nota != -1){
            System.out.println("Digite todas as suas notas ou digite -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaNota += nota;
                totalNotas++;
            }




        }

        System.out.println(String.format("Sua media foi: %.1f", mediaNota / totalNotas));
    }
}
