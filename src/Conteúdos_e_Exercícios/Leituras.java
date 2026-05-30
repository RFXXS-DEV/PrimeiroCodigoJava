package Conteúdos_e_Exercícios;

import java.util.Scanner;

public class Leituras {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o Ano dele: ");
        int ano = leitura.nextInt();
        System.out.println("Digite Loop nota: ");
        double notaFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(notaFilme);


    }
}
