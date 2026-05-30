package Conteúdos_e_Exercícios;

import java.util.Scanner;

public class Repetições {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;


        for (int i = 1; i < 4; i++) {
            System.out.println("Digite sua nota "+ i +":");
            nota = leitura.nextDouble();
            mediaNota += nota;

            
        }

        System.out.println(String.format("Sua media foi: %.1f", mediaNota/3));

    }
}
